package example.com

import android.support.v7.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //vals are like final in java (can't reassign)
        val string = "hello world";
        //string = "new stuff";

        //vars can be assigned
        var string2: String? = "creating variables";
        string2 = "new stuff";
        string2 = null;
        private fun getStringLength(string: String?): Int{
            //call length is string is non-null, otherwise return 0

            return string?.length ?: 0;

        //if(string2 != null){
          //  return string.length;
        //}
       // return 0;
    }

}
