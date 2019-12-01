package kr.co.tjoeun.a20191201_02_loginbasicpractice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_user_info.*
import kr.co.tjoeun.a20191201_02_loginbasicpractice.datas.UserData

class UserInfoActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_user_info)

        val user = intent.getSerializableExtra("userData") as UserData

//        val userIdFromIntent = intent.getStringExtra("userId")
        idTxt.text = user.userLoginId
//
//        val userPw = intent.getStringExtra("userPw")
        pwTxt.text = user.userLoginPw

//        val userHeight = intent.getDoubleExtra("userHeight", 0.1)

    }
}
