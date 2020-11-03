package com.example.fposcreenone

import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.PagerSnapHelper
import com.example.fposcreenone.adapter.*
import com.example.fposcreenone.model.*
import kotlinx.android.synthetic.main.activity_main.*





class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val sample1 = arrayOf("Explorer", "Explorer", "Explorer", "Explorer")
        val sample2 = arrayOf("My Learnings", "My Learnings", "My Learnings", "My Learnings")
        val sample3 = arrayOf("From your FPO", "From your FPO", "From your FPO", "From your FPO")

        // access the spinner


        if (spinner1 != null) {
            val adapter = ArrayAdapter(
                this,
                android.R.layout.simple_spinner_item, sample1
            )
            spinner1.adapter = adapter
            spinner1.onItemSelectedListener = object :
                AdapterView.OnItemSelectedListener {
                override fun onItemSelected(
                    parent: AdapterView<*>,
                    view: View, position: Int, id: Long
                ) {
                    (parent.getChildAt(0) as TextView).setTextColor(
                        ContextCompat.getColor(
                            this@MainActivity,
                            R.color.dark_green
                        )
                    )
                }

                override fun onNothingSelected(parent: AdapterView<*>) {
                    // write code to perform some action
                }
            }
        }

        if (spinner2 != null) {
            val adapter = ArrayAdapter(
                this,
                android.R.layout.simple_spinner_item, sample2
            )
            spinner2.adapter = adapter
            spinner2.onItemSelectedListener = object :
                AdapterView.OnItemSelectedListener {
                override fun onItemSelected(
                    parent: AdapterView<*>,
                    view: View, position: Int, id: Long
                ) {
                    (parent.getChildAt(0) as TextView).setTextColor(
                        ContextCompat.getColor(
                            this@MainActivity,
                            R.color.dark_green
                        )
                    )

                }

                override fun onNothingSelected(parent: AdapterView<*>) {
                    // write code to perform some action
                }
            }
        }

        if (spinner3 != null) {
            val adapter = ArrayAdapter(
                this,
                android.R.layout.simple_spinner_item, sample3
            )
            spinner3.adapter = adapter
            spinner3.onItemSelectedListener = object :
                AdapterView.OnItemSelectedListener {
                override fun onItemSelected(
                    parent: AdapterView<*>,
                    view: View, position: Int, id: Long
                ) {
                    (parent.getChildAt(0) as TextView).setTextColor(
                        ContextCompat.getColor(
                            this@MainActivity,
                            R.color.dark_green
                        )
                    )

                }

                override fun onNothingSelected(parent: AdapterView<*>) {
                    // write code to perform some action
                }
            }
        }



        setOngoingList()

        setTrendingList()

        setBlogList()

        setInformativeList()

        setLatestCourse()


        setNewsAndEventList()

    }

    private fun setNewsAndEventList() {
        val newsEventsList2: MutableList<NewsEventsModel2> = ArrayList()

        val newsEventsList: MutableList<NewsEventsModel> = ArrayList()

        newsEventsList.add(
            NewsEventsModel(
                "News",
                "Can Centre’s agriculture reforms positively impact farmers? experts have their say",
                "Jun 5th,2020",
                ContextCompat.getDrawable(this, R.drawable.news_events_thumbnail)!!
            )
        )
        newsEventsList.add(
            NewsEventsModel(
                "News",
                "Can Centre’s agriculture reforms positively impact farmers? experts have their say",
                "Jun 5th,2020",
                ContextCompat.getDrawable(this, R.drawable.news_events_thumbnail)!!
            )
        )
        newsEventsList.add(
            NewsEventsModel(
                "News",
                "Can Centre’s agriculture reforms positively impact farmers? experts have their say",
                "Jun 5th,2020",
                ContextCompat.getDrawable(this, R.drawable.news_events_thumbnail)!!
            )
        )
        newsEventsList.add(
            NewsEventsModel(
                "News",
                "Can Centre’s agriculture reforms positively impact farmers? experts have their say",
                "Jun 5th,2020",
                ContextCompat.getDrawable(this, R.drawable.news_events_thumbnail)!!
            )
        )




        newsEventsList2.add(
            NewsEventsModel2(
                "News",
                "Samunnati Partners with ET Virtual AgTech Summit 2020",
                "15th jun",
                " ",
                ContextCompat.getDrawable(this, R.drawable.news_events_pic)!!
            )
        )
        newsEventsList2.add(
            NewsEventsModel2(
                "News",
                "Samunnati Partners with ET Virtual AgTech Summit 2020  ",
                "15th jun",
                " ",
                ContextCompat.getDrawable(this, R.drawable.news_events_pic)!!
            )
        )
        newsEventsList2.add(
            NewsEventsModel2(
                "Event",
                "Samunnati Partners with ET Virtual AgTech Summit 2020",
                " ",
                "15th jun at 10:10AM",
                ContextCompat.getDrawable(this, R.drawable.news_events_pic)!!
            )
        )
        newsEventsList2.add(
            NewsEventsModel2(
                "Event",
                "Samunnati Partners with ET Virtual AgTech Summit 2020",
                " ",
                "15th jun at 10:10AM",
                ContextCompat.getDrawable(this, R.drawable.news_events_pic)!!
            )
        )
        rvNewsEventsOne.adapter =
            NewsEventsAdapter(newsEventsList)
        PagerSnapHelper().attachToRecyclerView(rvNewsEventsOne)


        // news and events 2 Recycler View


        rvNewsEventsTwo.adapter =
            NewsEventsAdapter2(newsEventsList2)

    }

    private fun setLatestCourse() {
        val latestCourseList: MutableList<LatestCoursesModel> = ArrayList()

        latestCourseList.add(
            LatestCoursesModel(
                "Labore nostrud Lorem.",
                "Sep 21, 2020 ",
                ContextCompat.getDrawable(this, R.drawable.latest_course_pic)!!
            )
        )
        latestCourseList.add(
            LatestCoursesModel(
                "Labore nostrud Lorem.",
                "Sep 21, 2020 ",
                ContextCompat.getDrawable(this, R.drawable.latest_course_pic)!!
            )
        )
        latestCourseList.add(
            LatestCoursesModel(
                "Labore nostrud Lorem.",
                "Sep 21, 2020 ",
                ContextCompat.getDrawable(this, R.drawable.latest_course_pic)!!
            )
        )
        latestCourseList.add(
            LatestCoursesModel(
                "Labore nostrud Lorem.",
                "Sep 21, 2020 ",
                ContextCompat.getDrawable(this, R.drawable.latest_course_pic)!!
            )
        )
        rvLatestCourse.adapter =
            LatestCoursesAdapter(latestCourseList)
        PagerSnapHelper().attachToRecyclerView(rvLatestCourse)

    }

    private fun setInformativeList() {
        val informativeVideosList: MutableList<InformativeVideosModel> = ArrayList()

        informativeVideosList.add(
            InformativeVideosModel(
                "Labore nostrud Lorem.",
                "Sep 21, 2020 ",
                ContextCompat.getDrawable(this, R.drawable.informative_videos_thumbnail)!!
            )
        )
        informativeVideosList.add(
            InformativeVideosModel(
                "Labore nostrud Lorem.",
                "Sep 21, 2020 ",
                ContextCompat.getDrawable(this, R.drawable.informative_videos_thumbnail)!!
            )
        )
        informativeVideosList.add(
            InformativeVideosModel(
                "Labore nostrud Lorem.",
                "Sep 21, 2020 ",
                ContextCompat.getDrawable(this, R.drawable.informative_videos_thumbnail)!!
            )
        )
        informativeVideosList.add(
            InformativeVideosModel(
                "Labore nostrud Lorem.",
                "Sep 21, 2020 ",
                ContextCompat.getDrawable(this, R.drawable.informative_videos_thumbnail)!!
            )
        )

        rvInformationVideos.adapter =
            InformativeVideosAdapter(
                informativeVideosList
            )
        PagerSnapHelper().attachToRecyclerView(rvInformationVideos)


    }

    private fun setBlogList() {
        val blogList: MutableList<BlogModel> = ArrayList()

        blogList.add(
            BlogModel(
                "Agriculture",
                "Incididunt ea deserunt culpa",
                "Dolor labore laborum incididunt ea deserunt culpa non pariatur. Labore ",
                ContextCompat.getDrawable(this, R.drawable.blogpic)!!
            )
        )
        blogList.add(
            BlogModel(
                "Agriculture",
                "Incididunt ea deserunt culpa",
                "Dolor labore laborum incididunt ea deserunt culpa non pariatur. Labore ",
                ContextCompat.getDrawable(this, R.drawable.blogpic)!!
            )
        )
        blogList.add(
            BlogModel(
                "Agriculture",
                "Incididunt ea deserunt culpa",
                "Dolor labore laborum incididunt ea deserunt culpa non pariatur. Labore ",
                ContextCompat.getDrawable(this, R.drawable.blogpic)!!
            )
        )
        blogList.add(
            BlogModel(
                "Agriculture",
                "Incididunt ea deserunt culpa",
                "Dolor labore laborum incididunt ea deserunt culpa non pariatur. Labore ",
                ContextCompat.getDrawable(this, R.drawable.blogpic)!!
            )
        )
        blogList.add(
            BlogModel(
                "Agriculture",
                "Incididunt ea deserunt culpa",
                "Dolor labore laborum incididunt ea deserunt culpa non pariatur. Labore ",
                ContextCompat.getDrawable(this, R.drawable.blogpic)!!
            )
        )



        rvBlog.adapter =
            BlogAdapter(blogList)
        PagerSnapHelper().attachToRecyclerView(rvBlog)

    }

    private fun setTrendingList() {
        val trendingNowList: MutableList<TrendingNowModel> = ArrayList()

        trendingNowList.add(
            TrendingNowModel(
                "Labore nostrud Lorem.",
                "The 'body matter' is the group of pages that contain the body of the text of the book. The front matter comes before it, containing title pages, content lists, publisher's metadata etc. It is followed by the back matter, which includes appendices, references, credits, colophon etc.[2] The distinction between the parts, body and other, is that the body matter is produced by the author, the front and back matter by the publisher (through the book designer, index collator etc.). Where there is a prose introduction, it demonstrates this; an introduction by the author is considered as body matter, an introduction by an editor or other commentator is placed with the front matter.[2] In some technical publications, appendices are so long and important as part of the book that they are a creative endeavour of the author, rather than a mere collation exercise by the publisher. In this case they may, like the introduction, be considered as a part of the body matter.",
                "1 hr 10 min",
                ContextCompat.getDrawable(this, R.drawable.trending_now_pic)!!
            )
        )


        trendingNowList.add(
            TrendingNowModel(
                "Labore nostrud Lorem.",
                "The 'body matter' is the group of pages that contain the body of the text of the book. The front matter comes before it, containing title pages, content lists, publisher's metadata etc. It is followed by the back matter, which includes appendices, references, credits, colophon etc.[2] The distinction between the parts, body and other, is that the body matter is produced by the author, the front and back matter by the publisher (through the book designer, index collator etc.). Where there is a prose introduction, it demonstrates this; an introduction by the author is considered as body matter, an introduction by an editor or other commentator is placed with the front matter.[2] In some technical publications, appendices are so long and important as part of the book that they are a creative endeavour of the author, rather than a mere collation exercise by the publisher. In this case they may, like the introduction, be considered as a part of the body matter.",
                "1 hr 10 min",
                ContextCompat.getDrawable(this, R.drawable.trending_now_pic)!!
            )
        )

        trendingNowList.add(
            TrendingNowModel(
                "Labore nostrud Lorem.",
                "Certifying Institute",
                "1 hr 10 min",
                ContextCompat.getDrawable(this, R.drawable.trending_now_pic)!!
            )
        )


        trendingNowList.add(
            TrendingNowModel(
                "Labore nostrud Lorem.",
                "Certifying Institute",
                "1 hr 10 min",
                ContextCompat.getDrawable(this, R.drawable.trending_now_pic)!!
            )
        )


        trendingNowList.add(
            TrendingNowModel(
                "Labore nostrud Lorem.",
                "Certifying Institute",
                "1 hr 10 min",
                ContextCompat.getDrawable(this, R.drawable.trending_now_pic)!!
            )
        )


        rvTrendingNow.layoutManager =
            GridLayoutManager(this, 2, GridLayoutManager.HORIZONTAL, false)
        rvTrendingNow.adapter = TrendingNowAdapter(trendingNowList)


    }

    private fun setOngoingList() {
        val ongoingCourseModelList: MutableList<OngoingCourseModel> = ArrayList()

        ongoingCourseModelList.add(
            OngoingCourseModel(
                "Lorem ipsum",
                "33:33",
                ContextCompat.getDrawable(this, R.drawable.rectangle_393)!!
            )
        )
        ongoingCourseModelList.add(
            OngoingCourseModel(
                "Lorem ipsum",
                "33:33",
                ContextCompat.getDrawable(this, R.drawable.rectangle_393)!!
            )
        )
        ongoingCourseModelList.add(
            OngoingCourseModel(
                "Lorem ipsum",
                "33:33",
                ContextCompat.getDrawable(this, R.drawable.rectangle_393)!!
            )
        )
        rvOngoingCourse?.adapter =
            OngoingCourseAdapter(
                ongoingCourseModelList
            )
        PagerSnapHelper().attachToRecyclerView(rvOngoingCourse)


    }


}
