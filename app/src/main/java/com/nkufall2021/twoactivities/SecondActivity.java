package com.nkufall2021.twoactivities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    public String paragraphOne = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Aliquam fringilla vulputate mollis. Vivamus rhoncus lectus ut leo tristique, eget ultricies lacus porta. Maecenas sit amet tincidunt urna. Vivamus id metus rutrum, interdum orci eu, mollis est. Nunc sed dui sodales, fermentum orci sit amet, rhoncus purus. Cras volutpat id turpis quis facilisis. Fusce rhoncus fringilla libero vel posuere. Nullam in pulvinar ex.\n" +
            "\n" +
            "Vestibulum rhoncus, erat at pellentesque pretium, enim ante eleifend ligula, id fermentum quam augue sed diam. Morbi blandit semper bibendum. Integer velit purus, faucibus eu justo eu, bibendum interdum metus. Sed non massa iaculis nisi bibendum suscipit eu id sapien. Integer odio sem, dapibus id diam a, scelerisque cursus elit. Curabitur ac purus interdum, porta lacus eu, fermentum nulla. Suspendisse id congue tellus. Nulla vulputate, erat sit amet sagittis placerat, urna mi efficitur ante, quis sagittis mauris massa condimentum sapien. In suscipit laoreet dolor vel malesuada. Nullam vitae porta mi. Ut et finibus enim, et rhoncus nibh. Nullam nec velit sapien. Etiam in ultrices elit." +
            "\n" + "Pellentesque placerat eleifend elementum. Pellentesque interdum ante eget tellus dapibus faucibus. Etiam sapien arcu, interdum ut odio at, ullamcorper maximus est. Nunc eu erat cursus, molestie orci a, ornare enim. Integer maximus id mauris in rhoncus. Sed a enim nulla. Cras nibh urna, molestie eu leo id, pulvinar tincidunt risus. Duis eget risus eget erat pharetra eleifend nec vitae orci. Mauris efficitur risus a tellus tincidunt, quis molestie purus tincidunt. Curabitur commodo nisi eu sapien ultricies blandit. Aenean gravida, lectus sit amet suscipit blandit, elit dolor rutrum orci, et ornare nisl elit porttitor dolor. Sed vel massa velit. Phasellus et nisl ac mi vestibulum auctor. Vivamus pretium nunc urna, a vestibulum erat vehicula et. Sed malesuada dictum tempus." +
            "\n" +
            "Duis et urna nec quam sodales molestie eget ac elit. Cras vel metus at magna fringilla ultricies a vitae odio. Vivamus congue blandit augue. Nulla facilisi. Morbi pharetra auctor metus et porta. Proin vulputate consequat risus, vel porttitor odio lacinia vel. Integer vestibulum, nisi nec finibus tristique, elit enim blandit urna, in pulvinar magna nulla vitae velit. Proin tincidunt sit amet nisi id eleifend. Quisque libero tortor, mattis a ipsum vitae, venenatis pulvinar massa. Aenean condimentum massa a semper euismod. Duis aliquet odio euismod pharetra porta. Morbi fringilla orci id nisl finibus condimentum.\n" +
            "\n" +
            "Nullam eget dapibus nunc, efficitur pellentesque eros. Nam ultrices cursus ligula, ac ultrices nunc sodales non. Integer sit amet egestas ante. Proin a sem mattis, imperdiet lorem eu, varius lectus. Vivamus vitae lectus condimentum, blandit orci eget, bibendum nisl. Proin pulvinar vestibulum volutpat. Nam elementum luctus neque, sed egestas purus ultrices vitae. Quisque id urna dui. Vestibulum vel risus mi. Sed et felis et lectus iaculis bibendum. Ut at libero quis ligula blandit lobortis sed at orci. Sed scelerisque elit quis mi luctus pellentesque. Nullam quis tincidunt lacus, et varius ipsum. Donec sodales est sit amet nulla hendrerit laoreet. In ornare ex sit amet lorem commodo, vitae gravida enim viverra.";
    public String paragraphTwo = "Morbi et tincidunt turpis. Maecenas tincidunt luctus odio, mollis commodo lectus dictum eu. Sed in congue diam. Pellentesque venenatis diam non leo luctus, sit amet aliquet augue dignissim. Suspendisse a nisl sit amet erat tristique aliquet ac eu ex. Aliquam pretium, ex interdum blandit consectetur, odio nisi molestie sem, eu convallis felis est rhoncus lacus. Fusce quis erat metus.\n" +
            "\n" +
            "Duis fringilla, purus in facilisis tincidunt, dolor arcu volutpat neque, vitae sagittis risus metus in velit. Morbi ligula elit, imperdiet eget eleifend sed, lacinia vel lectus. Class aptent taciti sociosqu ad litora torquent per conubia nostra, per inceptos himenaeos. Lorem ipsum dolor sit amet, consectetur adipiscing elit. Cras fringilla eros vel dui facilisis iaculis. Praesent elementum lacus id libero gravida auctor sit amet et felis. Quisque at cursus ante. Morbi sem mi, imperdiet ut pharetra a, interdum et mauris. Interdum et malesuada fames ac ante ipsum primis in faucibus. Etiam in urna auctor lectus iaculis vestibulum nec et elit. Sed finibus ante nibh, vitae commodo leo ullamcorper eu. Praesent varius nunc nec malesuada vestibulum. Curabitur ut consequat massa. Vivamus rutrum risus at dui aliquam, ornare pulvinar mi imperdiet.\n" +
            "\n" +
            "Nulla ut tortor mauris. Suspendisse viverra suscipit elit, in consequat quam dictum consequat. Praesent gravida, erat nec mattis cursus, purus lectus congue lectus, sed eleifend dolor magna at augue. Maecenas venenatis, libero ut vehicula lobortis, tellus purus vulputate ipsum, in scelerisque magna dolor id nulla. Duis dapibus, orci non blandit semper, augue lorem scelerisque ex, et luctus est nisi non urna. Vestibulum sagittis dapibus quam vel placerat. Nam at pellentesque dui, id lobortis ante. Proin turpis nunc, porttitor nec ante nec, ullamcorper gravida justo. Phasellus lacus dolor, molestie sit amet nisl ac, sodales hendrerit turpis. Phasellus ac dui sed felis vehicula sodales. Orci varius natoque penatibus et magnis dis parturient montes, nascetur ridiculus mus. Mauris porta felis a turpis rutrum, ac pulvinar turpis dapibus. Integer sed commodo lacus. Fusce fermentum ornare consectetur. In felis enim, placerat aliquam tincidunt non, ultricies eget urna." + "Curabitur scelerisque rutrum dolor vel imperdiet. Proin sed diam neque. Etiam vitae vulputate nisi. Praesent ullamcorper dolor non tellus laoreet, id hendrerit risus maximus. Pellentesque tincidunt, ligula vel volutpat viverra, urna odio porta odio, nec porta neque velit id urna. Cras pretium nulla auctor neque fermentum volutpat. Pellentesque luctus accumsan mollis. Maecenas ut dapibus leo. Vestibulum a nibh quis quam rutrum faucibus. Mauris pellentesque nibh at arcu semper, at blandit nisi mattis. Nunc vel enim varius diam finibus rutrum. Nullam at ligula a elit iaculis accumsan eu vel mi. Vivamus feugiat fringilla lorem, nec egestas neque tempus et.";
    public String paragraphThree = "Sed ut condimentum sem. Sed vel elementum odio, vel venenatis lacus. Duis non iaculis massa, quis viverra tellus. Nullam congue porta augue, sit amet consectetur nisi fermentum sit amet. Vivamus elementum ac dui sed volutpat. Sed condimentum sapien id sagittis euismod. Nunc turpis magna, condimentum vitae vestibulum eget, vulputate sit amet risus. Nunc varius molestie risus bibendum dictum. Nam nec mattis arcu. Praesent dapibus ullamcorper erat eu fermentum. Aenean venenatis ante ac orci venenatis pretium. Nunc quis arcu nec justo euismod laoreet ac vel urna.";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        String text = getIntent().getStringExtra("key");
        TextView textView = findViewById(R.id.text_message);
        if (text.equals("one")) {
            textView.setText(paragraphOne);
        }
        if (text.equals("two")) {
            textView.setText(paragraphTwo);
        }
        if (text.equals("three")) {
            textView.setText(paragraphThree);
        }
    }
}