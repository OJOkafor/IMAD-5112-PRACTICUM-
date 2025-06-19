
// ST10482230 , OBUMNEME JUNIOR OKAFOR

package za.ca.iie.imad5112practicumexam

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {
    // The four parallel arrays (song, artist,ratings,and  comments)
   private var songTitles = arrayOf<String>(findViewById(R.id.songInput1),findViewById(R.id.songInput2),findViewById(R.id.songInput3),findViewById(R.id.songInput4))
    private var artistOfNames = arrayOf<String>(findViewById(R.id.artistName1),findViewById(R.id.artistName2),findViewById(R.id.artistName3),findViewById(R.id.artistName4))
    private var ratings = arrayOf<String>(findViewById(R.id.rating1),findViewById(R.id.rating2),findViewById(R.id.rating3),findViewById(R.id.rating4))
    private var comments = arrayOf<String>(findViewById(R.id.comment1),findViewById(R.id.comment2),findViewById(R.id.comment3),findViewById(R.id.comment4))

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
// the three buttons
        val displayText = findViewById<TextView>(R.id.txtView)
        val addToPlaylistBTN = findViewById<Button>(R.id.addBTN)
        val detailedBTN = findViewById<Button>(R.id.detailBTN)
        val exitBTN = findViewById<Button>(R.id.exitBTN)

        // add to playlist button
        addToPlaylistBTN.setOnClickListener{
            var x = 0

            while (x < songTitles.count()) {
                displayText.text = "Please enter the the song details,first the name of the song"
                songTitles[x] = displayText.toString()
                displayText.text = " Please enter the artist."
                artistOfNames[x] = displayText.toString()
                displayText.text = "Please enter your rating of the song ( 1 - 5 )"
                ratings[x] = displayText.toString()
                displayText.text = "Please give your comment on the song "
                comments[x] = displayText.toString()
                x ++

            }

        }

        // move to the detailed screen button
        detailedBTN.setOnClickListener{
            playlistdetails()
        }
        // exit the app button
        exitBTN.setOnClickListener{
            finish()
        }


    }




// move to the detailed screen button function
    private fun playlistdetails() {
        val intent = Intent(this, DetailedViewScreen::class.java)
        startActivity(intent)
    }




}
