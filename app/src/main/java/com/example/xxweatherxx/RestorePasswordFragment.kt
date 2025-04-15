package com.example.xxweatherxx

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.xxweatherxx.databinding.FragmentRestorePasswordBinding

class RestorePasswordFragment : Fragment() {

    private var _binding: FragmentRestorePasswordBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentRestorePasswordBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        // Botón de regresar
        binding.btBack.setOnClickListener {
            findNavController().navigateUp()  // Regresa al fragmento anterior
        }

        // Botón de restablecer contraseña
        binding.btnReset.setOnClickListener {
            val email = binding.tietEmail.text.toString().trim()
            if (email.isNotEmpty()) {
                // Aquí iría tu lógica para enviar email de recuperación
                Toast.makeText(requireContext(), "Correo enviado a $email", Toast.LENGTH_SHORT).show()
            } else {
                Toast.makeText(requireContext(), "Ingresa un correo válido", Toast.LENGTH_SHORT).show()
            }
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}
