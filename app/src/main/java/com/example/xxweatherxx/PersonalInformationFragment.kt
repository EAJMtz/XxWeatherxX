package com.example.xxweatherxx

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import com.example.xxweatherxx.databinding.FragmentPersonalInformationBinding

class PersonalInformationFragment : Fragment() {

    private var _binding: FragmentPersonalInformationBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentPersonalInformationBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.btContinue.setOnClickListener {
            val name = binding.tietName.text.toString().trim()
            val lastNames = binding.tietLastNames.text.toString().trim()
            val username = binding.tietUsername.text.toString().trim()
            val birthDate = binding.tietBirthDate.text.toString().trim()
            val code = binding.tietCode.text.toString().trim()
            val hasReferralCode = binding.cbReferralCode.isChecked

            if (name.isNotEmpty() && lastNames.isNotEmpty() && username.isNotEmpty() && birthDate.isNotEmpty()) {
                // Aquí iría la lógica para guardar o enviar esta información
                Toast.makeText(requireContext(), "Información capturada correctamente", Toast.LENGTH_SHORT).show()

                // Ejemplo: podrías navegar a otro fragmento
                // findNavController().navigate(R.id.action_personalInformation_to_nextFragment)

            } else {
                Toast.makeText(requireContext(), "Completa todos los campos obligatorios", Toast.LENGTH_SHORT).show()
            }
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}
