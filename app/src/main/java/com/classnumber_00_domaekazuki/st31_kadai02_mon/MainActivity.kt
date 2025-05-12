package com.classnumber_00_domaekazuki.st31_kadai02_mon

import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        // TextView型の変数を作った
        // 画面に配置されている部品をID指定して取得する
        var textView: TextView = findViewById(R.id.message)
        // テキストを変更
        // String.xmlからテキストデータを取得
        textView.text = getString(R.string.pokemon)

        // 画面からボタンの要素を取得
        var okButton: Button = findViewById(R.id.button)
        // ボタンにクリックリスナーを付ける
        okButton.setOnClickListener {
            // ボタン押した時の処理
            textView.text = getString(R.string.pokemon_name)
        }

        // 画像の要素を取得
        var pokemonImage: ImageView = findViewById(R.id.image)
        // 画像を切り替える
        pokemonImage.setImageResource(R.drawable.img2)
    }
}