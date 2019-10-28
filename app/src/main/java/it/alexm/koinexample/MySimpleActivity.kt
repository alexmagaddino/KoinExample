package it.alexm.koinexample

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import org.koin.android.ext.android.inject


/**
 * Created by alexm on 28/10/2019
 */
class MySimpleActivity : AppCompatActivity() {

    // Lazy injected MySimplePresenter
    private val firstPresenter: MySimplePresenter by inject()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.prova_koin)
        findViewById<TextView>(R.id.text).text = firstPresenter.sayHello()

        //...
    }
}