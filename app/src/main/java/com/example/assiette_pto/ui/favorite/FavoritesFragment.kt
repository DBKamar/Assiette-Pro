package com.example.assiette_pto.ui.favorite

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.assiette_pto.adapters.MealAdapter
import com.example.assiette_pto.databinding.FragmentFavoritesBinding
import com.example.assiette_pto.manager.FavoritesManager

class FavoritesFragment : Fragment() {

    private var _binding: FragmentFavoritesBinding? = null
    private val binding get() = _binding!!

    private lateinit var mealAdapter: MealAdapter

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentFavoritesBinding.inflate(inflater, container, false)

        // Initialize RecyclerView
        mealAdapter = MealAdapter(emptyList()) { meal ->
            // Navigate to MealDetailFragment with meal ID
            val bundle = Bundle().apply {
                putString("mealId", meal.id)
            }
            findNavController().navigate(
                com.example.assiette_pto.R.id.action_navigation_favorites_to_mealDetailFragment,
                bundle
            )
        }
        binding.rvFavorites.layoutManager = LinearLayoutManager(requireContext())
        binding.rvFavorites.adapter = mealAdapter

        // Fetch favorites
        fetchFavorites()

        return binding.root
    }

    private fun fetchFavorites() {
        FavoritesManager.getFavorites(
            onSuccess = { meals ->
                mealAdapter.updateData(meals)
            },
            onFailure = { e ->
                Log.e("FavoritesFragment", "Error fetching favorites", e)
            }
        )
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}
