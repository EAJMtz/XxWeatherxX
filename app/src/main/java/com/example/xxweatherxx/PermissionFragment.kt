package com.example.xxweatherxx

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.xxweatherxx.databinding.FragmentLayoutPermissionBinding

class PermissionFragment : Fragment() {

    private var _binding: FragmentLayoutPermissionBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentLayoutPermissionBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        // Ejemplo de acción si tienes un botón en el layout
        binding.btnContinue?.setOnClickListener {
            // Aquí puedes usar Navigation para ir a otro fragmento
            // findNavController().navigate(R.id.action_permission_to_next)
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}
