package com.example.xxweatherxx

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import com.example.xxweatherxx.databinding.FragmentLayoutLoaderBinding

class LoaderFragment : Fragment() {

    private var _binding: FragmentLayoutLoaderBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentLayoutLoaderBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        // Ejemplo: Acción al dar clic en el botón
        binding.btnContinue.setOnClickListener {
            Toast.makeText(requireContext(), "¡Continuar presionado!", Toast.LENGTH_SHORT).show()
            // Aquí puedes usar findNavController().navigate(R.id.action_loader_to_login)
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}
