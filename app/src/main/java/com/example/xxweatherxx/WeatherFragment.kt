ppackage com.example.xxweatherxx

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.lifecycle.Observer
import com.example.xxweatherxx.databinding.FragmentWeatherBinding

class WeatherFragment : Fragment() {

    private var _binding: FragmentWeatherBinding? = null
    private val binding get() = _binding!!
    private val viewModel: WeatherViewModel by viewModels()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentWeatherBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        // Observadores de LiveData
        viewModel.city.observe(viewLifecycleOwner) {
            binding.tvCity.text = it
        }

        viewModel.temperature.observe(viewLifecycleOwner) {
            binding.tvTemperature.text = it
        }

        viewModel.isLoading.observe(viewLifecycleOwner) { isLoading ->
            binding.weatherLoader.visibility = if (isLoading) View.VISIBLE else View.GONE
        }

        // Simula la carga de clima
        viewModel.loadWeather()
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}
