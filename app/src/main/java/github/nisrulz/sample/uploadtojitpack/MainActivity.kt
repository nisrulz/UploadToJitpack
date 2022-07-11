package github.nisrulz.sample.uploadtojitpack

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.snackbar.Snackbar
import github.nisrulz.awesomelib.AwesomeLib
import github.nisrulz.sample.uploadtojitpack.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        binding.apply {
            setContentView(root)
            wireupUserInterface(this)
        }
    }

    private fun wireupUserInterface(binding: ActivityMainBinding) {
        binding.apply {
            fab.setOnClickListener { view: View? ->
                view?.let {
                    Snackbar.make(
                        view,
                        AwesomeLib.makeAwesome("World"),
                        Snackbar.LENGTH_LONG
                    ).setAction("Ok") { }.show()
                }
            }
        }
    }
}