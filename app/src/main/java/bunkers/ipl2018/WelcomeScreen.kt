package bunkers.ipl2018

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle

//import android.os.Handler

class WelcomeScreen : AppCompatActivity() {
    //private val welcomeScreen=3000

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_welcome_screen)

        val background = object : Thread() {
            override fun run() {
                try {
                    Thread.sleep(1000)
                    val intent = Intent(baseContext, MainActivity::class.java)
                    startActivity(intent)
                } catch (e: Exception) {
                    e.printStackTrace()
                }
            }
        }
        background.start()


        /*Handler().postDelayed({
            startActivity(Intent(this,MainActivity::class.java))
            finish()
        },welcomeScreen.toLong())*/
    }
}
