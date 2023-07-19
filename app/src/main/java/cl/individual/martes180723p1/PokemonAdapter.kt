package cl.individual.martes180723p1

import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import cl.individual.martes180723p1.databinding.ItemBinding

class PokemonAdapter : RecyclerView.Adapter<PokemonAdapter.MyViewHolder>() {
    val pokemonList = mutableListOf<Pokemon>()


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val binding = ItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)

        return MyViewHolder(binding)
    }

    override fun getItemCount(): Int {
        return pokemonList.size
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val pokemon: Pokemon = pokemonList[position]
        holder.txtNombre.text = pokemon.nombre
        holder.txtDetalle.text = pokemon.tipo

    }

    class MyViewHolder(binding: ItemBinding) : RecyclerView.ViewHolder(binding.root) {
        val txtNombre: TextView = binding.txtNombre
        val txtDetalle: TextView = binding.txtDetalle


    }
}