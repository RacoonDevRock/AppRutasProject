package ComplementosInterfaz.pasajero.consultas

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.cardview.widget.CardView
import androidx.fragment.app.Fragment
import com.example.rutas.R

private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [InformacionFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class InformacionFragment : Fragment() {
    // TODO: Rename and change types of parameters
    private var param1: String? = null
    private var param2: String? = null

    private lateinit var boton_horario: CardView
    private lateinit var boton_tarifa: CardView
    private lateinit var boton_ruta: CardView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            param1 = it.getString(ARG_PARAM1)
            param2 = it.getString(ARG_PARAM2)
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        //return inflater.inflate(R.layout.fragment_informacion, container, false)
        val view = inflater.inflate(R.layout.fragment_informacion, container, false)

        boton_horario = view.findViewById(R.id.boton_horario)
        boton_horario.setOnClickListener {
            val intent = Intent(activity, ConsultarHorarios::class.java)
            startActivity(intent)
        }

        boton_ruta = view.findViewById(R.id.boton_ruta)
        boton_ruta.setOnClickListener {
            val intent = Intent(activity, ConsultarRutas::class.java)
            startActivity(intent)
        }

        boton_tarifa = view.findViewById(R.id.boton_tarifa)
        boton_tarifa.setOnClickListener {
            val intent = Intent(activity, ConsultarTarifas::class.java)
            startActivity(intent)
        }

        return view
    }

    companion object {
        /**
         * Use this factory method to create a new instance of
         * this fragment using the provided parameters.
         *
         * @param param1 Parameter 1.
         * @param param2 Parameter 2.
         * @return A new instance of fragment InformacionFragment.
         */
        // TODO: Rename and change types and number of parameters
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            InformacionFragment().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }
    }
}