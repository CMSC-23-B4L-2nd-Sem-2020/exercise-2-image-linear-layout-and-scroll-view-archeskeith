package com.example.exer2_arches_b4l

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.view.*

class MainActivity : AppCompatActivity() {

    private lateinit var disneyImage: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val start: Button = findViewById(R.id.start)
        start.setOnClickListener{ randomizePic() }

        disneyImage = findViewById(R.id.imageView)

    }
    private fun randomizePic (){
        val randomInt = (1..10).random()
        val disneyImage : ImageView = findViewById(R.id.imageView)
        val disneyText : TextView = findViewById(R.id.disney_text)


//        val resultText: TextView = findViewById(R.id.result_text)
//        resultText.text = randomInt.toString()

        val drawableResource = when (randomInt){
            1 -> R.drawable.kurumi
            2 -> R.drawable.kotori
            3 -> R.drawable.miku
            4 -> R.drawable.mio
            5 -> R.drawable.nia
            6 -> R.drawable.origami
            7 -> R.drawable.reine
            8 -> R.drawable.shido
            9 -> R.drawable.tohka
            else -> R.drawable.yoshino
        }

            when (randomInt){
                1 -> disneyText.setText("Tokisaki Kurumi \n\n\n Mana Takamiya reported that Kurumi Tokisaki is the most dangerous Spirit ever known, having killed over 10,000 people (not including spacequake victims) personally.\n Kurumi Tokisaki had used unstated and unexplained methods to personally transfer into Shido Itsuka's high school and classroom so that she could get closer to him. Her purposes and reasons for moving were simple: consume Shido Itsuka, and in doing so, gain the Spirits' mana sealed within his body. During the time Kurumi was a Raizen high school student, she almost succeeded in consuming Shido. However, she was forced to retreat after being overwhelmed by Kotori Itsuka's destructive power. Kurumi had claimed that it was because she simply wasn't prepared to face her, but later argued that she could defeat Kotori if she had more time stored up")
                2 -> disneyText.setText("Itsuka Kotori \n\n\n Kotori Itsuka is Shido's foster little sister; she is also a middle school student as well as a commander of a secret organization known as <Ratatoskr> that deals with extraordinary beings known as Spirits through peaceful means.")
                3 -> disneyText.setText("Izayoi Miku \n\n\n Miku is a Spirit and an idol. She hates men to the point that Shido even had to cross-dress in order to interact with her. Her Angel, Gabriel has the ability to manipulate and brainwash people. She took an interest in the undercover Shido because he wasn't affected by her hypnotic powers and challenged him to a contest in which that if he lost, he would have to transfer to Rindouji. The challenge was for who would earn the title of being the best school. There was a singing contest which was later won by Miku, but the title of best school was won by Raizen High School. ")
                4 -> disneyText.setText("Takamiya Mio \n\n\n The First Spirit was the first Spirit to ever make an appearance on Earth. 30 years before the beginning of the events in Date A Live, she was summoned into the world by Sir Isaac Ray Pelham Westcott, Ellen Mira Mathers, and Elliot Baldwin Woodman through unknown means. However, her summoning also caused the first spacequake in history at some point of the frontier between China and Mongolia, killing over 150 million people and starting a chain of similar disasters around the world that would last approximately six months.")
                5 -> disneyText.setText("Honjou Nia \n\n\n Nia, also known as the Second Spirit, is a Spirit that appeared on Earth some time after the First Spirit appeared and is claimed to be the only one who knows any information about the First Spirit and her whereabouts. At some point, the D.E.M. captured her by unknown means and she fell into a comatose state. She was first mentioned in Volume 7, where Kurumi only decides to help Shido rescue Tohka to create a chance for her to find and rescue her. However, it turns out that Nia wasn't held captive in that particular DEM facility.")
                6 -> disneyText.setText("Tobiichi Origami \n\n\n Origami is a top student in her school in terms of academics and sports. Of course, none of the student body and facility members know that she is a member of the AST, with a few exceptions unknown to her. Origami is a very skilled wizard but can lose herself in her emotions when it comes to dealing with Spirits in combat.")
                7 -> disneyText.setText("Murasame Reine \n\n\n Reine is a highly intelligent and rational woman. She is the Analysis Officer of the Fraxinus’s crew and the assistant homeroom teacher of Shido's classroom. She is also the only member that could be considered \"normal\" among the Fraxinus's weird crew. Reine also acts as an unofficial aide to Kotori Itsuka, the commander of Fraxinus, due to the fact that the vice-commander acts like an idiot most of the time or is ignored by Kotori for being an idiot. ")
                8 -> disneyText.setText("Itsuka Shido \n\n\n Adopted into the Itsuka’s family household at a very young age, Shido has been living a fairly average normal life until recently. At the start of the series and his new high school year as a 2nd-year student, he accidentally stumbles into a new world unknown to him or to the public for that matter of fact. Discovering the real reason behind the spacequakes and the fight between the AST and the Spirits; forcefully or voluntarily, Shido was brought into the secret organization known as Ratatoskr that his little sister commands, which was also a surprise to him. With the only explanation from her being that only he can save the Spirits, Shido reluctantly joins due to his nature to help and save people in need. Going about with his normal life and rescuing Spirits is one thing, but with each new encounter and new Spirits to save, there is always some type of new hardship on Shido's mental health, since he has to deal with the opposite gender, with which he does not have much experience dealing. ")
                9 -> disneyText.setText("Yatogami Tohka \n\n\n When Tohka first appeared on Earth, on the 10th of April, she came under attack by the AST. That was also the same day Shido encountered Tohka and later discovered the real reason behind the spacequake incidents. The next time Tohka encountered Shido, she was again under attack by the AST. During Tohka and Shido's short conversation on their second encounter, Shido gave Tohka her name. During their third meeting in which they went out on a date, Tohka and Shido established a bond, as the boy explained to the Spirit that not all humans were like the AST, who are out to kill her. It was during this time after their date got interrupted by the AST that Tohka had her powers sealed by kissing Shido for the first time.")
                else -> disneyText.setText("Himekawa Yoshino \n\n\n Yoshino has the look of a young, cute girl at about 13 to 14 years of age with blue eyes and long curly blue hair. She wears a short white dress under a large green raincoat that has a tail with a pink ribbon attached to it, with a pair of rabbit-ear hood and holds her rabbit puppet, Yoshinon, in her left hand. Her preferred form of clothing appears to be sundresses along with boots that match her raincoat. After her Spirit power was sealed, she starts wearing a one-piece dress and a sunhat given to her by Reine.")
            }

        if(disneyImage!== null){
            disneyImage.setImageResource(drawableResource)
        }
    }


}
