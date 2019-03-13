package aplikasipasangan.fujiastuti.com.myapplicationcouple

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btnMatch.setOnClickListener {Pasangan()}
    }

    fun Pasangan() {
        val randomCowo = Random().nextInt (12)+1
        val randomCewe = Random().nextInt (5)+1
        val drawableResCewe = when (randomCewe) {
            1-> R.drawable.ayu_mobile
            2-> R.drawable.fuji_mobile
            3-> R.drawable.ce1
            4-> R.drawable.mela_mobile
            5-> R.drawable.faliz_mobile
            else -> R.drawable.umi_mobile
        }
        val drawableResCowo = when (randomCowo) {
            1-> R.drawable.deni_mobile
            2-> R.drawable.didik_mobile
            3-> R.drawable.edi_mobile
            4-> R.drawable.eggy_mobile
            5-> R.drawable.fanji_mobile
            6-> R.drawable.faqih_mobile
            7-> R.drawable.filipus_mobile
            8-> R.drawable.hafid_mobile
            9-> R.drawable.huda_mobile
            10-> R.drawable.iav_mobile
            11-> R.drawable.kiki_mobile
            12-> R.drawable.riki_mobile
            else -> R.drawable.luhur_mobile
        }
        ivDadul.setImageResource (drawableResCewe)
        ivDadu2.setImageResource(drawableResCowo)
    }
}
