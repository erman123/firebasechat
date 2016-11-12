package bo.seef.team.studentchat;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;

import butterknife.BindView;
import butterknife.ButterKnife;


public class ChatActivity extends AppCompatActivity {

    @BindView(R.id.toolbarChat)
    Toolbar toolbarChat;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chat);
        ButterKnife.bind(this);
        configInit();
    }

    private void configInit() {
        configToolbar();
    }

    private void configToolbar() {
        setSupportActionBar(toolbarChat);
        toolbarChat.setTitle("title");
    }

}
