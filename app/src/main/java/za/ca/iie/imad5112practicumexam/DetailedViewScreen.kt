package za.ca.iie.imad5112practicumexam

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class DetailedViewScreen : AppCompatActivity() {
    private var songTitles = arrayOf<String>(findViewById(R.id.songInput1),findViewById(R.id.songInput2),findViewById(R.id.songInput3),findViewById(R.id.songInput4))
    private var artistOfNames = arrayOf<String>(findViewById(R.id.artistName1),findViewById(R.id.artistName2),findViewById(R.id.artistName3),findViewById(R.id.artistName4))
    private var ratings = arrayOf<Int>(findViewById(R.id.rating1),findViewById(R.id.rating2),findViewById(R.id.rating3),findViewById(R.id.rating4))
    private var comments = arrayOf<String>(findViewById(R.id.comment1),findViewById(R.id.comment2),findViewById(R.id.comment3),findViewById(R.id.comment4))

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_detailed_view_screen)

// the variables used
        val listOfSongsbtn = findViewById<Button>(R.id.listBTN)
        val averageRatingbtn = findViewById<Button>(R.id.averageBTN)
        val returnToMainbtn = findViewById<Button>(R.id.returnBTN)
        val resulText = findViewById<TextView>(R.id.resultsViewtxt)

// the button to display the list of songs
        listOfSongsbtn.setOnClickListener{
            var counter = 0
            while (counter < songTitles.count()) {
                resulText.text =
                    "the song , $songTitles[counter], was made by $artistOfNames[counter] , with a rating of $ratings[counter] , addtional comments: $comments[counter]"
                counter ++

            }

        }

        // the button to calculate and display the average rating of the songs in the playlist
        averageRatingbtn.setOnClickListener{
            var counter = 0

            while (counter < songTitles.count()){
               var  totalRating =  ratings[counter] + ratings[counter+1]

                var averageRating  = totalRating/4
                resulText.text = averageRating.toString()
                counter ++
            }

        }
// the button to return to the main screen
        returnToMainbtn.setOnClickListener{
            val intent = Intent(this,MainActivity::class.java)
            startActivity(intent)

        }

    }
}