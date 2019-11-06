package com.tjoeun.a20191106_01_listviewpractice

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.tjoeun.a20191106_01_listviewpractice.adapters.NoticeAdapter
import com.tjoeun.a20191106_01_listviewpractice.datas.NoticeData
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {


    var noticeList = ArrayList<NoticeData>()
    var noticeAdapter:NoticeAdapter? = null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        addNotices()

        noticeAdapter = NoticeAdapter(this, noticeList)
        noticeListView.adapter = noticeAdapter


        noticeListView.setOnItemClickListener { parent, view, position, id ->

           // Toast.makeText(this, "${position} 번째 줄 클릭", Toast.LENGTH_SHORT).show()


            var noticeData = noticeList.get(position)

            var intent = Intent(this, NoticeDetailActivity::class.java)
            intent.putExtra("notice", noticeData)


            startActivity(intent)
        }

       noticeListView.setOnItemLongClickListener { parent, view, position, id ->


           Toast.makeText(this, "${position} 번째 줄 길게", Toast.LENGTH_SHORT).show()

           return@setOnItemLongClickListener true
       }

        }





    fun addNotices() {
        noticeList.add(NoticeData("1번공지", "1번 내용입니다.", "2019-01-01" ))
        noticeList.add(NoticeData("2번공지", "2번 내용입니다.", "2019-03-02" ))
        noticeList.add(NoticeData("3번공지", "3번 내용입니다.", "2019-04-01" ))
        noticeList.add(NoticeData("4번공지", "4번 내용입니다.", "2019-05-01" ))
        noticeList.add(NoticeData("5번공지", "5번 내용입니다.", "2019-06-01" ))
        noticeList.add(NoticeData("6번공지", "6번 내용입니다.", "2019-07-01" ))
        noticeList.add(NoticeData("7번공지", "7번 내용입니다.", "2019-08-01" ))
        noticeList.add(NoticeData("8번공지", "8번 내용입니다.", "2019-09-01" ))
        noticeList.add(NoticeData("9번공지", "9번 내용입니다.", "2019-10-01" ))
        noticeList.add(NoticeData("10번공지", "10번 내용입니다.", "2019-11-01" ))
        noticeList.add(NoticeData("11번공지", "11번 내용입니다.", "2019-12-01" ))
        noticeList.add(NoticeData("12번공지", "12번 내용입니다.", "2019-13-01" ))
        noticeList.add(NoticeData("13번공지", "13번 내용입니다.", "2019-14-01" ))

    }

}
