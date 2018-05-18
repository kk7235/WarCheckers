package com.kk_madcrows.warcheckers;

import android.annotation.SuppressLint;
import android.app.Dialog;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.Window;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivityP extends AppCompatActivity implements View.OnClickListener {
    LinearLayout start;TextView timer,player1,player2;MediaPlayer mp,mov1;
    int move = 0;public int scorey=16,scorer=16;TextView scor,scoy;  CountDownTimer c;
    LinearLayout gc1, gd2, ge3, fc4, fd5, fe6, ea7, eb8, ec9, ed10, ee11, ef12, eg13, da14, db15, dc16, dd17, de18, df19, dg20, ca21, cb22, cc23, cd24, ce25, cf26, cg27, bc28, bd29, be30, ac31, ad32, ae33;
int first=3;
    /*    other.getId() == ec9.getId() || other.getId() == ec9.getId())*/

void check()
{if(scorey==0)
{showAlertred();}
else if(scorer==0){showAlertyellow();}
}


    void swap()
        {if(first==2)
            first=3;
        else first=2;
        }
void color(LinearLayout l)
{if(first==2)
  l.setBackgroundResource(R.drawable.yelloww);
else
    l.setBackgroundResource(R.drawable.redd);

}
    void color2(LinearLayout l)
    {if(first==2)
        l.setBackgroundResource(R.drawable.yellow);
    else
        l.setBackgroundResource(R.drawable.red);

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout);
        scor = findViewById(R.id.scorer);
        scoy = findViewById(R.id.scorey);
        timer1();
        Intent svc=new Intent(this, BackgroundSoundService.class);
        startService(svc);
        player1 = findViewById(R.id.player1);
        player2 = findViewById(R.id.player2);
       timer = findViewById(R.id.timer);
     mp = MediaPlayer.create(this, R.raw.stone);
        mov1= MediaPlayer.create(this, R.raw.fight);

        gc1 = findViewById(R.id.gc1);
        gc1.setOnClickListener((View.OnClickListener) this);
        gd2 = findViewById(R.id.gd2);
        gd2.setOnClickListener((View.OnClickListener) this);
        ge3 = findViewById(R.id.ge3);
        ge3.setOnClickListener((View.OnClickListener) this);
        fc4 = findViewById(R.id.fc4);
        fc4.setOnClickListener((View.OnClickListener) this);
        fd5 = findViewById(R.id.fd5);
        fd5.setOnClickListener((View.OnClickListener) this);
        fe6 = findViewById(R.id.fe6);
        fe6.setOnClickListener((View.OnClickListener) this);
        ea7 = findViewById(R.id.ea7);
        ea7.setOnClickListener((View.OnClickListener) this);
        eb8 = findViewById(R.id.eb8);
        eb8.setOnClickListener((View.OnClickListener) this);
        ec9 = findViewById(R.id.ec9);
        ec9.setOnClickListener((View.OnClickListener) this);
        ed10 = findViewById(R.id.ed10);
        ed10.setOnClickListener((View.OnClickListener) this);
        ee11 = findViewById(R.id.ee11);
        ee11.setOnClickListener((View.OnClickListener) this);
        ef12 = findViewById(R.id.ef12);
        ef12.setOnClickListener((View.OnClickListener) this);
        eg13 = findViewById(R.id.eg13);
        eg13.setOnClickListener((View.OnClickListener) this);
        da14 = findViewById(R.id.da14);
        da14.setOnClickListener((View.OnClickListener) this);
        db15 = findViewById(R.id.db15);
        db15.setOnClickListener((View.OnClickListener) this);
        dc16 = findViewById(R.id.dc16);
        dc16.setOnClickListener((View.OnClickListener) this);
        dd17 = findViewById(R.id.dd17);
        dd17.setOnClickListener((View.OnClickListener) this);
        de18 = findViewById(R.id.de18);
        de18.setOnClickListener((View.OnClickListener) this);
        df19 = findViewById(R.id.df19);
        df19.setOnClickListener((View.OnClickListener) this);
        dg20 = findViewById(R.id.dg20);
        dg20.setOnClickListener((View.OnClickListener) this);
        ca21 = findViewById(R.id.ca21);
        ca21.setOnClickListener((View.OnClickListener) this);
        cb22 = findViewById(R.id.cb22);
        cb22.setOnClickListener((View.OnClickListener) this);
        cc23 = findViewById(R.id.cc23);
        cc23.setOnClickListener((View.OnClickListener) this);
        cd24 = findViewById(R.id.cd24);
        cd24.setOnClickListener((View.OnClickListener) this);
        ce25 = findViewById(R.id.ce25);
        ce25.setOnClickListener((View.OnClickListener) this);
        cf26 = findViewById(R.id.cf26);
        cf26.setOnClickListener((View.OnClickListener) this);
        cg27 = findViewById(R.id.cg27);
        cg27.setOnClickListener((View.OnClickListener) this);
        bc28 = findViewById(R.id.bc28);
        bc28.setOnClickListener((View.OnClickListener) this);
        bd29 = findViewById(R.id.bd29);
        bd29.setOnClickListener((View.OnClickListener) this);
        be30 = findViewById(R.id.be30);
        be30.setOnClickListener((View.OnClickListener) this);
        ac31 = findViewById(R.id.ac31);
        ac31.setOnClickListener((View.OnClickListener) this);
        ad32 = findViewById(R.id.ad32);
        ad32.setOnClickListener((View.OnClickListener) this);
        ae33 = findViewById(R.id.ae33);
        ae33.setOnClickListener((View.OnClickListener) this);
        String a=getIntent().getStringExtra("first");
        String b=getIntent().getStringExtra("second");
        player1.setText(a);
        player2.setText(b);

    }

    @SuppressLint("ResourceAsColor")
    @Override
    public void onClick(View view) {
        switch (view.getId())

        {
            case R.id.gc1:
                if (move == 0) {
                    if(gc1.getWeightSum()==1)
                    {       Toast.makeText(this, "INVALID SELECTION", Toast.LENGTH_SHORT).show();}
                    else{
                        if(first==gc1.getWeightSum())
                        {swap();
color(gc1); mp.start();
                        start = gc1;
                    move = 1;}else{ Toast.makeText(this, "wait for your turn", Toast.LENGTH_SHORT).show();}

                    }

                }  else if(start==gc1)
                {move=0;
                    swap();
                    Toast.makeText(this, " SELECTION CANCELED", Toast.LENGTH_SHORT).show();}
                else check(start, gc1);
                break;

            case R.id.ec9:
                if (move == 0) {

                    if(ec9.getWeightSum()==1)
                    {       Toast.makeText(this, "INVALID SELECTION", Toast.LENGTH_SHORT).show();}
                    else{if(first==ec9.getWeightSum())
                    {swap();
                        color(ec9);mp.start();
                        start = ec9;
                        move = 1;}else{ Toast.makeText(this, "wait for your turn", Toast.LENGTH_SHORT).show();}

                    }
                }

                 else if(start==ec9)
                {move=0;
                color2(start);swap();
                    Toast.makeText(this, " SELECTION CANCELED", Toast.LENGTH_SHORT).show();}
                else check(start, ec9);
                break;
            case R.id.ge3:
                if (move == 0) {
                    if(ge3.getWeightSum()==1)
                    {       Toast.makeText(this, "INVALID SELECTION", Toast.LENGTH_SHORT).show();}
                    else{if(first==ge3.getWeightSum())
                    {swap();mp.start();
                        color(ge3);
                        start = ge3;
                        move = 1;}else{ Toast.makeText(this, "wait for your turn", Toast.LENGTH_SHORT).show();}

                    }


                } else if(start==ge3)
                {move=0;
                    color2(start);swap();
                    Toast.makeText(this, " SELECTION CANCELED", Toast.LENGTH_SHORT).show();}
                else check(start, ge3);
                break;
            case R.id.ee11:
                if (move == 0) {
                    if(ee11.getWeightSum()==1)
                    {       Toast.makeText(this, "INVALID SELECTION", Toast.LENGTH_SHORT).show();}
                    else{if(first==ee11.getWeightSum())
                    {swap();mp.start();
                        color(ee11);
                        start = ee11;
                        move = 1;}else{ Toast.makeText(this, "wait for your turn", Toast.LENGTH_SHORT).show();}

                    }


                } else if(start==ee11)
            {move=0;
                color2(start);swap();
                Toast.makeText(this, " SELECTION CANCELED", Toast.LENGTH_SHORT).show();}
            else check(start,ee11);
                break;

            case R.id.fc4:
                if (move == 0) {
                    if(fc4.getWeightSum()==1)
                    {       Toast.makeText(this, "INVALID SELECTION", Toast.LENGTH_SHORT).show();}
                    else{if(first==fc4.getWeightSum())
                    {swap();mp.start();
                        color(fc4);
                        start =fc4;
                        move = 1;}else{ Toast.makeText(this, "wait for your turn", Toast.LENGTH_SHORT).show();}

                    }


                }  else if(start==fc4)
            {move=0;
                color2(start);swap();
                Toast.makeText(this, " SELECTION CANCELED", Toast.LENGTH_SHORT).show();}
            else check(start, fc4);
                break;
            case R.id.fd5:
                if (move == 0) {
                    if(fd5.getWeightSum()==1)
                    {       Toast.makeText(this, "INVALID SELECTION", Toast.LENGTH_SHORT).show();}
                    else{if(first==fd5.getWeightSum())
                    {swap();mp.start();
                        color(fd5);
                        start = fd5;
                        move = 1;}else{ Toast.makeText(this, "wait for your turn", Toast.LENGTH_SHORT).show();}

                    }


                } else if(start==fd5)
                {move=0;
                    color2(start);swap();
                    Toast.makeText(this, " SELECTION CANCELED", Toast.LENGTH_SHORT).show();}
                else check(start,fd5);
                break;
            case R.id.gd2:
                if (move == 0) {
                    if(gd2.getWeightSum()==1)
                    {       Toast.makeText(this, "INVALID SELECTION", Toast.LENGTH_SHORT).show();}
                    else{if(first==gd2.getWeightSum())
                    {swap();mp.start();
                        color(gd2);
                        start = gd2;
                        move = 1;}else{ Toast.makeText(this, "wait for your turn", Toast.LENGTH_SHORT).show();}

                    }


                } else if(start==gd2)
                {move=0;
                    color2(start);swap();
                    Toast.makeText(this, " SELECTION CANCELED", Toast.LENGTH_SHORT).show();}
                else check(start, gd2);
                break;
            case R.id.fe6:
                if (move == 0) {
                    if(fe6.getWeightSum()==1)
                    {       Toast.makeText(this, "INVALID SELECTION", Toast.LENGTH_SHORT).show();}
                    else{if(first==fe6.getWeightSum())
                    {swap();mp.start();
                        color(fe6);
                        start = fe6;
                        move = 1;}else{ Toast.makeText(this, "wait for your turn", Toast.LENGTH_SHORT).show();}

                    }


                }  else if(start==fe6)
            {move=0;
                color2(start);swap();
                Toast.makeText(this, " SELECTION CANCELED", Toast.LENGTH_SHORT).show();}
            else check(start, fe6);
                break;
            case R.id.eb8:
                if (move == 0) {
                    if(eb8.getWeightSum()==1)
                    {       Toast.makeText(this, "INVALID SELECTION", Toast.LENGTH_SHORT).show();}
                    else{if(first==eb8.getWeightSum())
                    {swap();mp.start();
                        color(eb8);
                        start =eb8;
                        move = 1;}else{ Toast.makeText(this, "wait for your turn", Toast.LENGTH_SHORT).show();}

                    }


                } else if(start==eb8)
                {move=0;
                    color2(start);swap();
                    Toast.makeText(this, " SELECTION CANCELED", Toast.LENGTH_SHORT).show();}
                else check(start,eb8);
                break;
            case R.id.ef12:
                if (move == 0) {
                    if(ef12.getWeightSum()==1)
                    {       Toast.makeText(this, "INVALID SELECTION", Toast.LENGTH_SHORT).show();}
                    else{if(first==ef12.getWeightSum())
                    {swap();mp.start();
                        color(ef12);
                        start = ef12;
                        move = 1;}else{ Toast.makeText(this, "wait for your turn", Toast.LENGTH_SHORT).show();}

                    }


                } else if(start==ef12)
                {move=0;
                    color2(start);swap();
                    Toast.makeText(this, " SELECTION CANCELED", Toast.LENGTH_SHORT).show();}
                else check(start, ef12);
                break;
            case R.id.da14:
                if (move == 0) {
                    if(da14.getWeightSum()==1)
                    {       Toast.makeText(this, "INVALID SELECTION", Toast.LENGTH_SHORT).show();}
                    else{if(first==da14.getWeightSum())
                    {swap();mp.start();
                        color(da14);
                        start = da14;
                        move = 1;}else{ Toast.makeText(this, "wait for your turn", Toast.LENGTH_SHORT).show();}

                    }


                } else if(start==da14)
                {move=0;
                    color2(start);swap();
                    Toast.makeText(this, " SELECTION CANCELED", Toast.LENGTH_SHORT).show();}
                else check(start,da14);
                break;
            case R.id.dc16:
                if (move == 0) {
                    if(dc16.getWeightSum()==1)
                    {       Toast.makeText(this, "INVALID SELECTION", Toast.LENGTH_SHORT).show();}
                    else{if(first==dc16.getWeightSum())
                        {swap();mp.start();
                            color(dc16);
                            start =dc16;
                            move = 1;}else{ Toast.makeText(this, "wait for your turn", Toast.LENGTH_SHORT).show();}

                    }


                } else if(start==dc16)
            {move=0;
                color2(start);swap();
                Toast.makeText(this, " SELECTION CANCELED", Toast.LENGTH_SHORT).show();}
            else check(start,dc16);
                break;
            case R.id.de18:
                if (move == 0) {
                    if(de18.getWeightSum()==1)
                    {       Toast.makeText(this, "INVALID SELECTION", Toast.LENGTH_SHORT).show();}
                    else{if(first==de18.getWeightSum())
                    {swap();mp.start();
                        color(de18);
                        start = de18;
                        move = 1;}else{ Toast.makeText(this, "wait for your turn", Toast.LENGTH_SHORT).show();}

                    }


                } else if(start==de18)
            {move=0;
                color2(start);swap();
                Toast.makeText(this, " SELECTION CANCELED", Toast.LENGTH_SHORT).show();}
            else check(start,de18);
                break;
            case R.id.ed10:
                if (move == 0) {
                    if(ed10.getWeightSum()==1)
                    {       Toast.makeText(this, "INVALID SELECTION", Toast.LENGTH_SHORT).show();}
                    else{if(first==ed10.getWeightSum())
                    {swap();mp.start();
                        color(ed10);
                        start = ed10;
                        move = 1;}else{ Toast.makeText(this, "wait for your turn", Toast.LENGTH_SHORT).show();}

                     }

                } else if(start==ed10)
                {move=0;
                    color2(start);swap();
                    Toast.makeText(this, " SELECTION CANCELED", Toast.LENGTH_SHORT).show();}
                else check(start,ed10);
                break;
            case R.id.db15:
                if (move == 0) {
                    if(db15.getWeightSum()==1)
                    {       Toast.makeText(this, "INVALID SELECTION", Toast.LENGTH_SHORT).show();}
                    else{if(first==db15.getWeightSum())
                    {swap();mp.start();
                        color(db15);
                        start = db15;
                        move = 1;}else{ Toast.makeText(this, "wait for your turn", Toast.LENGTH_SHORT).show();}

                    }
                }

                 else if(start==db15)
                {move=0;
                    color2(start);swap();
                    Toast.makeText(this, " SELECTION CANCELED", Toast.LENGTH_SHORT).show();}
                else check(start,db15);
                break;
            case R.id.dd17:
                if (move == 0) {
                    if(dd17.getWeightSum()==1)
                    {       Toast.makeText(this, "INVALID SELECTION", Toast.LENGTH_SHORT).show();}
                    else{if(first==dd17.getWeightSum())
                    {swap();mp.start();
                        color(dd17);
                        start = dd17;
                        move = 1;}else{ Toast.makeText(this, "wait for your turn", Toast.LENGTH_SHORT).show();}

                    }


                } else if(start==dd17)
                {move=0;
                    color2(start);swap();
                    Toast.makeText(this, " SELECTION CANCELED", Toast.LENGTH_SHORT).show();}
                else check(start,dd17);
                break;
            case R.id.df19:
                if (move == 0) {
                    if(df19.getWeightSum()==1)
                    {       Toast.makeText(this, "INVALID SELECTION", Toast.LENGTH_SHORT).show();}
                    else{if(first==df19.getWeightSum())
                    {swap();mp.start();
                        color(df19);
                        start = df19;
                        move = 1;}else{ Toast.makeText(this, "wait for your turn", Toast.LENGTH_SHORT).show();}

                    }


                } else if(start==df19)
                {move=0;
                    color2(start);swap();
                    Toast.makeText(this, " SELECTION CANCELED", Toast.LENGTH_SHORT).show();}
                else check(start,df19);
                break;
            case R.id.dg20:
                if (move == 0) {
                    if(dg20.getWeightSum()==1)
                    {       Toast.makeText(this, "INVALID SELECTION", Toast.LENGTH_SHORT).show();}
                    else{if(first==dg20.getWeightSum())
                    {swap();mp.start();
                        color(dg20);
                        start = dg20;
                        move = 1;}else{ Toast.makeText(this, "wait for your turn", Toast.LENGTH_SHORT).show();}

                    }


                } else if(start==dg20)
            {move=0;
                color2(start);swap();
                Toast.makeText(this, " SELECTION CANCELED", Toast.LENGTH_SHORT).show();}
            else check(start,dg20);
                break;
            case R.id.ca21:
                if (move == 0) {
                    if(ca21.getWeightSum()==1)
                    {       Toast.makeText(this, "INVALID SELECTION", Toast.LENGTH_SHORT).show();}
                    else{if(first==ca21.getWeightSum())
                    {swap();mp.start();
                        color(ca21);
                        start = ca21;
                        move = 1;}else{ Toast.makeText(this, "wait for your turn", Toast.LENGTH_SHORT).show();}

                    }


                } else if(start==ca21)
                {move=0;
                    color2(start);swap();
                    Toast.makeText(this, " SELECTION CANCELED", Toast.LENGTH_SHORT).show();}
                else check(start,ca21);
                break;
            case R.id.cc23:
                if (move == 0) {
                    if(cc23.getWeightSum()==1)
                    {       Toast.makeText(this, "INVALID SELECTION", Toast.LENGTH_SHORT).show();}
                    else{if(first==cc23.getWeightSum())
                    {swap();mp.start();
                        color(cc23);
                        start = cc23;
                        move = 1;}else{ Toast.makeText(this, "wait for your turn", Toast.LENGTH_SHORT).show();}

                    }


                } else if(start==cc23)
                {move=0;
                    color2(start);swap();
                    Toast.makeText(this, " SELECTION CANCELED", Toast.LENGTH_SHORT).show();}
                else check(start, cc23);
                break;
            case R.id.ea7:
                if (move == 0) {
                    if(ea7.getWeightSum()==1)
                    {       Toast.makeText(this, "INVALID SELECTION", Toast.LENGTH_SHORT).show();}
                    else {
                        if (first == ea7.getWeightSum()) {
                            swap();mp.start();
                            color(ea7);
                            start = ea7;
                            move = 1;
                        } else {
                            Toast.makeText(this, "wait for your turn", Toast.LENGTH_SHORT).show();
                        }

                    }


                } else if(start==ea7)
                {move=0;
                    color2(start);swap();
                    Toast.makeText(this, " SELECTION CANCELED", Toast.LENGTH_SHORT).show();}
                else check(start,ea7);
                break;
            case R.id.cb22:
                if (move == 0) {
                    if(cb22.getWeightSum()==1)
                    {       Toast.makeText(this, "INVALID SELECTION", Toast.LENGTH_SHORT).show();}
                    else{if(first==cb22.getWeightSum())
                    {swap();mp.start();
                        color(cb22);
                        start = cb22;
                        move = 1;}else{ Toast.makeText(this, "wait for your turn", Toast.LENGTH_SHORT).show();}

                    }


                } else if(start==cb22)
                {move=0;
                    color2(start);swap();
                    Toast.makeText(this, " SELECTION CANCELED", Toast.LENGTH_SHORT).show();}
                else check(start,cb22);
                break;
            case R.id.cd24:
                if (move == 0) {
                    if(cd24.getWeightSum()==1)
                    {       Toast.makeText(this, "INVALID SELECTION", Toast.LENGTH_SHORT).show();}
                    else{if(first==cd24.getWeightSum())
                    {swap();mp.start();
                        color(cd24);
                        start = cd24;
                        move = 1;}else{ Toast.makeText(this, "wait for your turn", Toast.LENGTH_SHORT).show();}

                    }


                } else if(start==cd24)
                {move=0;
                    color2(start);swap();
                    Toast.makeText(this, " SELECTION CANCELED", Toast.LENGTH_SHORT).show();}
                else check(start,cd24);
                break;
            case R.id.ce25:
                if (move == 0) {
                    if(ce25.getWeightSum()==1)
                    {       Toast.makeText(this, "INVALID SELECTION", Toast.LENGTH_SHORT).show();}
                    else{if(first==ce25.getWeightSum())
                    {swap();mp.start();
                        color(ce25);
                        start = ce25;
                        move = 1;}else{ Toast.makeText(this, "wait for your turn", Toast.LENGTH_SHORT).show();}

                    }


                } else if(start==ce25)
                {move=0;
                    color2(start);swap();
                    Toast.makeText(this, " SELECTION CANCELED", Toast.LENGTH_SHORT).show();}
                else check(start,ce25);
                break;
            case R.id.cf26:
                if (move == 0) {
                    if(cf26.getWeightSum()==1)
                    {       Toast.makeText(this, "INVALID SELECTION", Toast.LENGTH_SHORT).show();}
                    else{if(first==cf26.getWeightSum())
                    {swap();mp.start();
                        color(cf26);
                        start = cf26;
                        move = 1;}else{ Toast.makeText(this, "wait for your turn", Toast.LENGTH_SHORT).show();}

                    }


                } else if(start==cf26)
                {move=0;
                    color2(start);swap();
                    Toast.makeText(this, " SELECTION CANCELED", Toast.LENGTH_SHORT).show();}
                else check(start,cf26);
                break;
            case R.id.cg27:
                if (move == 0) {
                    if(cg27.getWeightSum()==1)
                    {       Toast.makeText(this, "INVALID SELECTION", Toast.LENGTH_SHORT).show();}
                    else{if(first==cg27.getWeightSum())
                    {swap();mp.start();
                        color(cg27);
                        start = cg27;
                        move = 1;}else{ Toast.makeText(this, "wait for your turn", Toast.LENGTH_SHORT).show();}

                    }


                } else if(start==cg27)
                {move=0;
                    color2(start);swap();
                    Toast.makeText(this, " SELECTION CANCELED", Toast.LENGTH_SHORT).show();}
                else check(start,cg27);
                break;
            case R.id.eg13:
                if (move == 0) {
                    if(eg13.getWeightSum()==1)
                    {       Toast.makeText(this, "INVALID SELECTION", Toast.LENGTH_SHORT).show();}
                    else{if(first==eg13.getWeightSum())
                    {swap();mp.start();
                        color(eg13);
                        start = eg13;
                        move = 1;}else{ Toast.makeText(this, "wait for your turn", Toast.LENGTH_SHORT).show();}

                    }


                } else if(start==eg13)
                {move=0;
                    color2(start);swap();
                    Toast.makeText(this, " SELECTION CANCELED", Toast.LENGTH_SHORT).show();}
                else check(start,eg13);
                break;
            case R.id.bc28:
                if (move == 0) {
                    if(bc28.getWeightSum()==1)
                    {       Toast.makeText(this, "INVALID SELECTION", Toast.LENGTH_SHORT).show();}
                    else{if(first==bc28.getWeightSum())
                    {swap();mp.start();
                        color(bc28);
                        start = bc28;
                        move = 1;}else{ Toast.makeText(this, "wait for your turn", Toast.LENGTH_SHORT).show();}

                    }


                } else if(start==bc28)
                {move=0;
                    color2(start);swap();
                    Toast.makeText(this, " SELECTION CANCELED", Toast.LENGTH_SHORT).show();}
                else check(start,bc28);
                break;
            case R.id.bd29:
                if (move == 0) {
                    if(bd29.getWeightSum()==1)
                    {       Toast.makeText(this, "INVALID SELECTION", Toast.LENGTH_SHORT).show();}
                    else{if(first==bd29.getWeightSum())
                    {swap();mp.start();
                        color(bd29);
                        start = bd29;
                        move = 1;}else{ Toast.makeText(this, "wait for your turn", Toast.LENGTH_SHORT).show();}

                    }


                } else if(start==bd29)
                {move=0;
                    color2(start);swap();
                    Toast.makeText(this, " SELECTION CANCELED", Toast.LENGTH_SHORT).show();}
                else check(start,bd29);
                break;
            case R.id.be30:
                if (move == 0) {
                    if(be30.getWeightSum()==1)
                    {       Toast.makeText(this, "INVALID SELECTION", Toast.LENGTH_SHORT).show();}
                    else{if(first==be30.getWeightSum())
                    {swap();mp.start();
                        color(be30);
                        start = be30;
                        move = 1;}else{ Toast.makeText(this, "wait for your turn", Toast.LENGTH_SHORT).show();}

                    }


                } else if(start==be30)
                {move=0;
                    color2(start);swap();
                    Toast.makeText(this, " SELECTION CANCELED", Toast.LENGTH_SHORT).show();}
                else check(start,be30);
                break;
            case R.id.ad32:
                if (move == 0) {
                    if(ad32.getWeightSum()==1)
                    {       Toast.makeText(this, "INVALID SELECTION", Toast.LENGTH_SHORT).show();}
                    else{if(first==ad32.getWeightSum())
                    {swap();mp.start();
                        color(ad32);
                        start = ad32;
                        move = 1;}else{ Toast.makeText(this, "wait for your turn", Toast.LENGTH_SHORT).show();}

                    }


                } else if(start==ad32)
                {move=0;
                    color2(start);swap();
                    Toast.makeText(this, " SELECTION CANCELED", Toast.LENGTH_SHORT).show();}
                else check(start,ad32);
                break;
            case R.id.ac31:
                if (move == 0) {
                    if(ac31.getWeightSum()==1)
                    {       Toast.makeText(this, "INVALID SELECTION", Toast.LENGTH_SHORT).show();}
                    else{if(first==ac31.getWeightSum())
                    {swap();mp.start();
                        color(ac31);
                        start = ac31;
                        move = 1;}else{ Toast.makeText(this, "wait for your turn", Toast.LENGTH_SHORT).show();}

                    }


                }else if(start==ac31)
                {move=0;
                    color2(start);swap();
                    Toast.makeText(this, " SELECTION CANCELED", Toast.LENGTH_SHORT).show();}
                else check(start,ac31);
                break;
            case R.id.ae33:
                if (move == 0) {
                    if(ae33.getWeightSum()==1)
                    {       Toast.makeText(this, "INVALID SELECTION", Toast.LENGTH_SHORT).show();}
                    else{if(first==ae33.getWeightSum())
                    {swap();mp.start();
                        color(ae33);
                        start = ae33;
                        move = 1;}else{ Toast.makeText(this, "wait for your turn", Toast.LENGTH_SHORT).show();}

                    }


                }else if(start==ae33)
            {move=0;
                color2(start);
                swap();
                Toast.makeText(this, " SELECTION CANCELED", Toast.LENGTH_SHORT).show();}
            else check(start,ae33 );
                break;


        }

    }

    void check(LinearLayout first, LinearLayout second) {
        switch (first.getId())

        {
            case R.id.gc1:
                swapgc1(second);
                break;
            case R.id.gd2:
                swapgd2(second);
                break;
            case R.id.ge3:
                swapge3(second);
                break;
            case R.id.fc4:
                swapfc4(second);
                break;
            case R.id.fd5:
                swapfd5(second);
                break;
            case R.id.fe6:
                swapfe6(second);
                break;
            case R.id.ea7:
                swapea7(second);
                break;
            case R.id.eb8:
                swapeb8(second);
                break;
            case R.id.ec9:
                swapec9(second);
                break;
            case R.id.ed10:
                swaped10(second);
                break;
            case R.id.ee11:
                swapee11(second);
                break;
            case R.id.ef12:
                swapef12(second);
                break;
            case R.id.eg13:
            swapeeg13(second);
            break;
            case R.id.da14:
                swapeda14(second);
                break;
            case R.id.db15:
                swapedb15(second);
                break;
            case R.id.dc16:
                swapedc16(second);
                break;
            case R.id.dd17:
                swapedd17(second);
                break;
            case R.id.de18:
                swapede18(second);
                break;
            case R.id.df19:
                swapedf19(second);
                break;
            case R.id.dg20:
                swapedg20(second);
                break;
            case R.id.ca21:
                swapeca21(second);
                break;
            case R.id.cb22:
                swapecb22(second);
                break;
            case R.id.cc23:
                swapecc23(second);
                break;
            case R.id.cd24:
                swapecd24(second);
                break;
            case R.id.ce25:
                swapece25(second);
                break;
            case R.id.cf26:
                swapecf26(second);
                break;
            case R.id.cg27:
                swapecg27(second);
                break;
            case R.id.bc28:
                swapebc28(second);
                break;
            case R.id.bd29:
                swapebd29(second);
                break;
            case R.id.be30:
                swapebe30(second);
                break;
            case R.id.ac31:
                swapeac31(second);
                break;
            case R.id.ad32:
                swapead32(second);
                break;
            case R.id.ae33:
                swapeae33(second);
                break;
        }
    }

    void swapgc1(LinearLayout other) {
        if (other.getId() == ec9.getId()) {
            if (fc4.getWeightSum() != 1 && gc1.getWeightSum() != fc4.getWeightSum()&&ec9.getWeightSum()==1) {
                move2(gc1, fc4, ec9);

            } else {
                Toast.makeText(this, "INVALID MOVE", Toast.LENGTH_SHORT).show();
            }
        } else if (other.getId() == ge3.getId()) {
            if (gd2.getWeightSum() != 1 && gc1.getWeightSum() != gd2.getWeightSum()&&ge3.getWeightSum()==1) {
                move2(gc1, gd2, ge3);

            } else {
                Toast.makeText(this, "INVALID MOVE", Toast.LENGTH_SHORT).show();
            }
        } else if (other.getId() == ee11.getId()) {
            if (fd5.getWeightSum() != 1 && gc1.getWeightSum() != fd5.getWeightSum()&&ee11.getWeightSum()==1) {
                move2(gc1, fd5, ee11);

            } else {
                Toast.makeText(this, "INVALID MOVE", Toast.LENGTH_SHORT).show();
            }}
        else if (other.getId() == fc4.getId()) {
            if (fc4.getWeightSum() == 1) {
                move1(gc1, fc4);

            } else {
                Toast.makeText(this, "INVALID MOVE", Toast.LENGTH_SHORT).show();
            }}

        else if (other.getId() == gd2.getId()) {
            if (gd2.getWeightSum() == 1) {
                move1(gc1, gd2);

            } else {
                Toast.makeText(this, "INVALID MOVE", Toast.LENGTH_SHORT).show();
            }}
        else {
            Toast.makeText(this, "INVALID MOVE", Toast.LENGTH_SHORT).show();
        }
    }



    void move2(LinearLayout first, LinearLayout center, LinearLayout second) {


        first.setBackgroundResource(R.drawable.center);
        first.setWeightSum(1);
        if (center.getWeightSum() == 3) {

            center.setWeightSum(1);
            center.setBackgroundResource(R.drawable.center);
            second.setWeightSum(2);
            second.setBackgroundResource(R.drawable.red);move = 0; scorey=scorey-1;String a= String.valueOf(scorey);
           scoy.setText(a);  timer2();
check();

        } else {
            center.setWeightSum(1);
            center.setBackgroundResource(R.drawable.center);
            second.setWeightSum(3);
            second.setBackgroundResource(   R.drawable.yellow);
            move = 0;
            scorer=scorer-1;String a= String.valueOf(scorer);
            scor.setText(a);  timer2();
check();

        }}
    void move1(LinearLayout first,LinearLayout second) {



        if (first.getWeightSum() == 2) {
            second.setWeightSum(2);
            second.setBackgroundResource(R.drawable.red);move = 0;
            first.setBackgroundResource(R.drawable.center);
            first.setWeightSum(1);
            timer2();
            mov1.start();
        } else {

            second.setWeightSum(3);
            second.setBackgroundResource(R.drawable.yellow);
            move = 0;
            timer2();
            first.setBackgroundResource(R.drawable.center);
            first.setWeightSum(1);   mov1.start();
        }

    }
    void swapgd2(LinearLayout other) {

    if (other.getId() == eb8.getId()) {
            if (fc4.getWeightSum() != 1 &&gd2.getWeightSum()!= fc4.getWeightSum()&&eb8.getWeightSum()==1) {
                move2(gd2,fc4, eb8);

            } else {
                Toast.makeText(this, "INVALID MOVE", Toast.LENGTH_SHORT).show();
            }
        } else if (other.getId() == ed10.getId()) {
            if (fd5.getWeightSum() != 1 && gd2.getWeightSum() != fd5.getWeightSum()&&ed10.getWeightSum()==1) {
                move2(gd2, fd5, ed10);

            } else {
                Toast.makeText(this, "INVALID MOVE", Toast.LENGTH_SHORT).show();
            }
        } else if (other.getId() == ef12.getId()) {
            if (fe6.getWeightSum() != 1 && gd2.getWeightSum() != fe6.getWeightSum()&&ef12.getWeightSum()==1) {
                move2(gd2, fe6, ef12);

            } else {
                Toast.makeText(this, "INVALID MOVE", Toast.LENGTH_SHORT).show();
            }}
        else if (other.getId() == gc1.getId()) {
            if (gc1.getWeightSum() == 1) {
                move1(gd2, gc1);

            } else {
                Toast.makeText(this, "INVALID MOVE", Toast.LENGTH_SHORT).show();
            }}
        else if (other.getId() == fd5.getId()) {
            if (fd5.getWeightSum() == 1) {
                move1(gd2, fd5);

            } else {
                Toast.makeText(this, "INVALID MOVE", Toast.LENGTH_SHORT).show();
            }}
        else if (other.getId() ==ge3.getId()) {
            if (ge3.getWeightSum() == 1) {
                move1(gd2, ge3);

            } else {
                Toast.makeText(this, "INVALID MOVE", Toast.LENGTH_SHORT).show();
            }}
        else {
            Toast.makeText(this, "INVALID MOVE", Toast.LENGTH_SHORT).show();
        }
    }

    void swapge3(LinearLayout other) {
        if (other.getId() == gc1.getId()) {
            if (gd2.getWeightSum() != 1 &&ge3.getWeightSum() != gd2.getWeightSum()&&gc1.getWeightSum()==1) {
                move2(ge3, gd2, gc1);

            } else {
                Toast.makeText(this, "INVALID MOVE", Toast.LENGTH_SHORT).show();
            }
        } else if (other.getId() == ec9.getId()) {
            if (fd5.getWeightSum() != 1 && ge3.getWeightSum() != fd5.getWeightSum()&&ec9.getWeightSum()==1) {
                move2(ge3, fd5, ec9);

            } else {
                Toast.makeText(this, "INVALID MOVE", Toast.LENGTH_SHORT).show();
            }
        } else if (other.getId() == ee11.getId()) {
            if (fe6.getWeightSum() != 1 && ge3.getWeightSum() != fe6.getWeightSum()&&ee11.getWeightSum()==1) {
                move2(ge3, fe6, ee11);

            } else {
                Toast.makeText(this, "INVALID MOVE", Toast.LENGTH_SHORT).show();
            }}
        else if (other.getId() == gd2.getId()) {
            if (gd2.getWeightSum() == 1) {
                move1(ge3,gd2);

            } else {
                Toast.makeText(this, "INVALID MOVE", Toast.LENGTH_SHORT).show();
            }}
        else if (other.getId() == fe6.getId()) {
            if (fe6.getWeightSum() == 1) {
                move1(ge3, fe6);

            } else {
                Toast.makeText(this, "INVALID MOVE", Toast.LENGTH_SHORT).show();
            }}

        else {
            Toast.makeText(this, "INVALID MOVE", Toast.LENGTH_SHORT).show();
        }
    }

    void swapfc4(LinearLayout other) {
        if (other.getId() == da14.getId()) {
            if (eb8.getWeightSum() != 1 && fc4.getWeightSum() != eb8.getWeightSum()&&da14.getWeightSum()==1) {
                move2(fc4, eb8, da14);

            } else {
                Toast.makeText(this, "INVALID MOVE", Toast.LENGTH_SHORT).show();
            }
        } else if (other.getId() == dc16.getId()) {
            if (ec9.getWeightSum() != 1 && ec9.getWeightSum() != fc4.getWeightSum()&&dc16.getWeightSum()==1) {
                move2(fc4,ec9,dc16);

            } else {
                Toast.makeText(this, "INVALID MOVE", Toast.LENGTH_SHORT).show();
            }
        } else if (other.getId() == de18.getId()) {
            if (ed10.getWeightSum() != 1 && ed10.getWeightSum() != fc4.getWeightSum()&&de18.getWeightSum()==1) {
                move2(fc4,ed10,de18);

            } else {
                Toast.makeText(this, "INVALID MOVE", Toast.LENGTH_SHORT).show();
            }}
        else if (other.getId() == fe6.getId()) {
            if (fd5.getWeightSum() != 1 && fd5.getWeightSum() !=fc4.getWeightSum()&&fe6.getWeightSum()==1) {
                move2(fc4,fd5,fe6);

            } else {
                Toast.makeText(this, "INVALID MOVE", Toast.LENGTH_SHORT).show();
            }}
        else if (other.getId() == ec9.getId()) {
            if (ec9.getWeightSum() == 1) {
                move1(fc4, ec9);

            } else {
                Toast.makeText(this, "INVALID MOVE", Toast.LENGTH_SHORT).show();
            }}
        else if (other.getId() == fd5.getId()) {
            if (fd5.getWeightSum() == 1) {
                move1(fc4, fd5);

            } else {
                Toast.makeText(this, "INVALID MOVE", Toast.LENGTH_SHORT).show();
            }}
        else if (other.getId() == gc1.getId()) {
            if (gc1.getWeightSum() == 1) {
                move1(fc4, gc1);

            } else {
                Toast.makeText(this, "INVALID MOVE", Toast.LENGTH_SHORT).show();
            }}
        else {
            Toast.makeText(this, "INVALID MOVE", Toast.LENGTH_SHORT).show();
        }
    }

    void swapfd5(LinearLayout other) {
        if (other.getId() == db15.getId()) {
            if (ec9.getWeightSum() != 1 && fd5.getWeightSum() !=ec9.getWeightSum()&&db15.getWeightSum()==1) {
                move2(fd5,ec9, db15);

            } else {
                Toast.makeText(this, "INVALID MOVE", Toast.LENGTH_SHORT).show();
            }
        } else if (other.getId() == dd17.getId()) {
            if (ed10.getWeightSum() != 1 &&fd5.getWeightSum() != ed10.getWeightSum()&&dd17.getWeightSum()==1) {
                move2(fd5,ed10,dd17);

            } else {
                Toast.makeText(this, "INVALID MOVE", Toast.LENGTH_SHORT).show();
            }
        } else if (other.getId() == df19.getId()) {
            if (ee11.getWeightSum() != 1 && ee11.getWeightSum() != fd5.getWeightSum()&&df19.getWeightSum()==1) {
                move2(fd5,ee11,df19);

            } else {
                Toast.makeText(this, "INVALID MOVE", Toast.LENGTH_SHORT).show();
            }}

        else if (other.getId() == ed10.getId()) {
            if (ed10.getWeightSum() == 1) {
                move1(fd5, ed10);

            } else {
                Toast.makeText(this, "INVALID MOVE", Toast.LENGTH_SHORT).show();
            }}
        else if (other.getId() == fc4.getId()) {
            if (fc4.getWeightSum() == 1) {
                move1(fd5, fc4);

            } else {
                Toast.makeText(this, "INVALID MOVE", Toast.LENGTH_SHORT).show();
            }}
        else if (other.getId() == fe6.getId()) {
            if (fe6.getWeightSum() == 1) {
                move1(fd5, fe6);

            } else {
                Toast.makeText(this, "INVALID MOVE", Toast.LENGTH_SHORT).show();
            }}
        else if (other.getId() == gd2.getId()) {
            if (gd2.getWeightSum() == 1) {
                move1(fd5, gd2);

            } else {
                Toast.makeText(this, "INVALID MOVE", Toast.LENGTH_SHORT).show();
            }}
        else {
            Toast.makeText(this, "INVALID MOVE", Toast.LENGTH_SHORT).show();
        }
    }

    void swapfe6(LinearLayout other) {
        if (other.getId() == dc16.getId()) {
            if (ed10.getWeightSum() != 1 && fe6.getWeightSum() !=ed10.getWeightSum()&&dc16.getWeightSum()==1) {
                move2(fe6,ed10, dc16);

            } else {
                Toast.makeText(this, "INVALID MOVE", Toast.LENGTH_SHORT).show();
            }
        } else if (other.getId() == de18.getId()) {
            if (ee11.getWeightSum() != 1 &&ee11.getWeightSum() != fe6.getWeightSum()&&de18.getWeightSum()==1) {
                move2(fe6,ee11,de18);

            } else {
                Toast.makeText(this, "INVALID MOVE", Toast.LENGTH_SHORT).show();
            }
        } else if (other.getId() == dg20.getId()) {
            if (ef12.getWeightSum() != 1 && fe6.getWeightSum() != ef12.getWeightSum()&&dg20.getWeightSum()==1) {
                move2(fe6,ef12,dg20);

            } else {
                Toast.makeText(this, "INVALID MOVE", Toast.LENGTH_SHORT).show();
            }}

        else if (other.getId() == ge3.getId()) {
            if (ge3.getWeightSum() == 1) {
                move1(fe6, ge3);

            } else {
                Toast.makeText(this, "INVALID MOVE", Toast.LENGTH_SHORT).show();
            }}
        else if (other.getId() == fd5.getId()) {
            if (fd5.getWeightSum() == 1) {
                move1(fe6, fd5);

            } else {
                Toast.makeText(this, "INVALID MOVE", Toast.LENGTH_SHORT).show();
            }}
        else if (other.getId() == ee11.getId()) {
            if (ee11.getWeightSum() == 1) {
                move1(fe6,ee11);

            } else {
                Toast.makeText(this, "INVALID MOVE", Toast.LENGTH_SHORT).show();
            }}

        else {
            Toast.makeText(this, "INVALID MOVE", Toast.LENGTH_SHORT).show();
        }
    }
    void swapea7(LinearLayout other) {
        if (other.getId() == ca21.getId()) {
            if (da14.getWeightSum() != 1 && ea7.getWeightSum() != da14.getWeightSum()&&ca21.getWeightSum()==1) {
                move2(ea7, da14,ca21);

            } else {
                Toast.makeText(this, "INVALID MOVE", Toast.LENGTH_SHORT).show();
            }
        } else if (other.getId() == cc23.getId()) {
            if (db15.getWeightSum() != 1 && ea7.getWeightSum() != db15.getWeightSum()&&cc23.getWeightSum()==1) {
                move2(ea7, db15, cc23);

            } else {
                Toast.makeText(this, "INVALID MOVE", Toast.LENGTH_SHORT).show();
            }
        } else if (other.getId() == ec9.getId()) {
            if (eb8.getWeightSum() != 1 && ea7.getWeightSum() != eb8.getWeightSum()&&ec9.getWeightSum()==1) {
                move2(ea7, eb8, ec9);

            } else {
                Toast.makeText(this, "INVALID MOVE", Toast.LENGTH_SHORT).show();
            }}
        else if (other.getId() == da14.getId()) {
            if (da14.getWeightSum() == 1) {
                move1(ea7,da14);

            } else {
                Toast.makeText(this, "INVALID MOVE", Toast.LENGTH_SHORT).show();
            }}

        else if (other.getId() == eb8.getId()) {
            if (eb8.getWeightSum() == 1) {
                move1(ea7, eb8);

            } else {
                Toast.makeText(this, "INVALID MOVE", Toast.LENGTH_SHORT).show();
            }}
        else {
            Toast.makeText(this, "INVALID MOVE", Toast.LENGTH_SHORT).show();
        }
    }

    void swapeb8(LinearLayout other) {
        if (other.getId() == cb22.getId()) {
            if (db15.getWeightSum() != 1 && eb8.getWeightSum() != cb22.getWeightSum()&&cb22.getWeightSum()==1) {
                move2(eb8, db15, cb22 );

            } else {
                Toast.makeText(this, "INVALID MOVE", Toast.LENGTH_SHORT).show();
            }
        } else if (other.getId() == cd24.getId()) {
            if (dc16.getWeightSum() != 1 && eb8.getWeightSum() != dc16.getWeightSum()&&cd24.getWeightSum()==1) {
                move2(eb8, dc16, cd24);

            } else {
                Toast.makeText(this, "INVALID MOVE", Toast.LENGTH_SHORT).show();
            }
        } else if (other.getId() == ed10.getId()) {
            if (ec9.getWeightSum() != 1 && eb8.getWeightSum() != ec9.getWeightSum()&&ed10.getWeightSum()==1) {
                move2(eb8,ec9, ed10);

            } else {
                Toast.makeText(this, "INVALID MOVE", Toast.LENGTH_SHORT).show();
            }}
        else if (other.getId() == ea7.getId()) {
            if (ea7.getWeightSum() == 1) {
                move1(eb8, ea7);

            } else {
                Toast.makeText(this, "INVALID MOVE", Toast.LENGTH_SHORT).show();
            }}

        else if (other.getId() == db15.getId()) {
            if (db15.getWeightSum() == 1) {
                move1(eb8, db15);

            } else {
                Toast.makeText(this, "INVALID MOVE", Toast.LENGTH_SHORT).show();
            }}
        else if (other.getId() == ec9.getId()) {
            if (ec9.getWeightSum() == 1) {
                move1(eb8,ec9);

            } else {
                Toast.makeText(this, "INVALID MOVE", Toast.LENGTH_SHORT).show();
            }}
        else {
            Toast.makeText(this, "INVALID MOVE", Toast.LENGTH_SHORT).show();
        }
    }
    void swapec9(LinearLayout other) {
        if (other.getId() == ea7.getId()) {
            if (eb8.getWeightSum() != 1 && ec9.getWeightSum() != eb8.getWeightSum()&&ea7.getWeightSum()==1) {
                move2(ec9,eb8, ea7);

            } else {
                Toast.makeText(this, "INVALID MOVE", Toast.LENGTH_SHORT).show();
            }
        } else if (other.getId() == cc23.getId()) {
            if (dc16.getWeightSum() != 1 && ec9.getWeightSum() != dc16.getWeightSum()&&cc23.getWeightSum()==1) {
                move2(ec9, dc16,cc23);

            } else {
                Toast.makeText(this, "INVALID MOVE", Toast.LENGTH_SHORT).show();
            }
        } else if (other.getId() == ce25.getId()) {
            if (dd17.getWeightSum() != 1 && ec9.getWeightSum() != dd17.getWeightSum()&&ce25.getWeightSum()==1) {
                move2(ec9, dd17, ce25);

            } else {
                Toast.makeText(this, "INVALID MOVE", Toast.LENGTH_SHORT).show();
            }}
        else if (other.getId() == ca21.getId()) {
            if (ec9.getWeightSum() != 1 && db15.getWeightSum() != ec9.getWeightSum()&&ca21.getWeightSum()==1) {
                move2(ec9, db15,ca21);

            } else {
                Toast.makeText(this, "INVALID MOVE", Toast.LENGTH_SHORT).show();
            }}
        else if (other.getId() == ee11.getId()) {
            if (ec9.getWeightSum() != 1 && ed10.getWeightSum() != ec9.getWeightSum()&&ee11.getWeightSum()==1) {
                move2(ec9, ed10,ee11);

            } else {
                Toast.makeText(this, "INVALID MOVE", Toast.LENGTH_SHORT).show();
            }}
        else if (other.getId() == gc1.getId()) {
            if (ec9.getWeightSum() != 1 && ec9.getWeightSum() != fc4.getWeightSum()&&gc1.getWeightSum()==1) {
                move2(ec9, fc4,gc1);

            } else {
                Toast.makeText(this, "INVALID MOVE", Toast.LENGTH_SHORT).show();
            }}
        else if (other.getId() == ge3.getId()) {
            if (fd5.getWeightSum() != 1 && ec9.getWeightSum() != fd5.getWeightSum()&&ge3.getWeightSum()==1) {
                move2(ec9, fd5,ge3);

            } else {
                Toast.makeText(this, "INVALID MOVE", Toast.LENGTH_SHORT).show();
            }}
        else if (other.getId() == eb8.getId()) {
            if (eb8.getWeightSum() == 1) {
                move1(ec9,eb8);

            } else {
                Toast.makeText(this, "INVALID MOVE", Toast.LENGTH_SHORT).show();
            }}

        else if (other.getId() == dc16.getId()) {
            if (dc16.getWeightSum() == 1) {
                move1(ec9,dc16);

            } else {
                Toast.makeText(this, "INVALID MOVE", Toast.LENGTH_SHORT).show();
            }}
        else if (other.getId() == ed10.getId()) {
            if (ed10.getWeightSum() == 1) {
                move1(ec9,ed10);

            } else {
                Toast.makeText(this, "INVALID MOVE", Toast.LENGTH_SHORT).show();
            }}
        else if (other.getId() == fc4.getId()) {
            if (fc4.getWeightSum() == 1) {
                move1(ec9,fc4);

            } else {
                Toast.makeText(this, "INVALID MOVE", Toast.LENGTH_SHORT).show();
            }}
        else {
            Toast.makeText(this, "INVALID MOVE", Toast.LENGTH_SHORT).show();
        }
    }
    void swaped10(LinearLayout other) {
        if (other.getId() == eb8.getId()) {
            if (ec9.getWeightSum() != 1 && ed10.getWeightSum() != ec9.getWeightSum()&&eb8.getWeightSum()==1) {
                move2(ed10,ec9, eb8);

            } else {
                Toast.makeText(this, "INVALID MOVE", Toast.LENGTH_SHORT).show();
            }
        } else if (other.getId() == cb22.getId()) {
            if (dc16.getWeightSum() != 1 && ed10.getWeightSum() != dc16.getWeightSum()&&cb22.getWeightSum()==1) {
                move2(ed10, dc16,cb22);

            } else {
                Toast.makeText(this, "INVALID MOVE", Toast.LENGTH_SHORT).show();
            }
        } else if (other.getId() == cd24.getId()) {
            if (dd17.getWeightSum() != 1 && ed10.getWeightSum() != dd17.getWeightSum()&& cd24.getWeightSum()==1) {
                move2(ed10, dd17, cd24);

            } else {
                Toast.makeText(this, "INVALID MOVE", Toast.LENGTH_SHORT).show();
            }}
        else if (other.getId() == cf26.getId()) {
            if (de18.getWeightSum() != 1 && ed10.getWeightSum() != de18.getWeightSum()&& cf26.getWeightSum()==1) {
                move2(ed10,de18, cf26);

            } else {
                Toast.makeText(this, "INVALID MOVE", Toast.LENGTH_SHORT).show();
            }}
        else if (other.getId() == ef12.getId()) {
            if (ee11.getWeightSum() != 1 && ed10.getWeightSum() != ee11.getWeightSum()&& ef12.getWeightSum()==1) {
                move2(ed10,ee11, ef12);

            } else {
                Toast.makeText(this, "INVALID MOVE", Toast.LENGTH_SHORT).show();
            }}

        else if (other.getId() == gd2.getId()) {
            if (fd5.getWeightSum() != 1 && ed10.getWeightSum() !=fd5.getWeightSum()&&gd2.getWeightSum()==1) {
                move2(ed10, fd5,gd2);

            } else {
                Toast.makeText(this, "INVALID MOVE", Toast.LENGTH_SHORT).show();
            }}


        else if (other.getId() == ec9.getId()) {
            if (ec9.getWeightSum() == 1) {
                move1(ed10,ec9);

            } else {
                Toast.makeText(this, "INVALID MOVE", Toast.LENGTH_SHORT).show();
            }}

        else if (other.getId() == dd17.getId()) {
            if (dd17.getWeightSum() == 1) {
                move1(ed10,dd17);

            } else {
                Toast.makeText(this, "INVALID MOVE", Toast.LENGTH_SHORT).show();
            }}
        else if (other.getId() == ee11.getId()) {
            if (ee11.getWeightSum() == 1) {
                move1(ed10,ee11);

            } else {
                Toast.makeText(this, "INVALID MOVE", Toast.LENGTH_SHORT).show();
            }}
        else if (other.getId() == fd5.getId()) {
            if (fd5.getWeightSum() == 1) {
                move1(ed10,fd5);

            } else {
                Toast.makeText(this, "INVALID MOVE", Toast.LENGTH_SHORT).show();
            }}
        else {
            Toast.makeText(this, "INVALID MOVE", Toast.LENGTH_SHORT).show();
        }
    }
    void swapee11(LinearLayout other) {
        if (other.getId() == ec9.getId()) {
            if (ed10.getWeightSum() != 1 && ed10.getWeightSum() != ee11.getWeightSum()&& ec9.getWeightSum()==1) {
                move2(ee11,ed10,  ec9);

            } else {
                Toast.makeText(this, "INVALID MOVE", Toast.LENGTH_SHORT).show();
            }
        } else if (other.getId() == cc23.getId()) {
            if (dd17.getWeightSum() != 1 && ee11.getWeightSum() != dd17.getWeightSum()&&cc23.getWeightSum()==1) {
                move2(ee11, dd17,cc23);

            } else {
                Toast.makeText(this, "INVALID MOVE", Toast.LENGTH_SHORT).show();
            }
        } else if (other.getId() == ce25.getId()) {
            if (de18.getWeightSum() != 1 && ee11.getWeightSum() != de18.getWeightSum()&& ce25.getWeightSum()==1) {
                move2(ee11, de18, ce25);

            } else {
                Toast.makeText(this, "INVALID MOVE", Toast.LENGTH_SHORT).show();
            }}
        else if (other.getId() == cg27.getId()) {
            if (df19.getWeightSum() != 1 && ee11.getWeightSum() != df19.getWeightSum()&& cg27.getWeightSum()==1) {
                move2(ee11,df19,cg27);

            } else {
                Toast.makeText(this, "INVALID MOVE", Toast.LENGTH_SHORT).show();
            }}
        else if (other.getId() == eg13.getId()) {
            if (ef12.getWeightSum() != 1 && ee11.getWeightSum() != ef12.getWeightSum()&& eg13.getWeightSum()==1) {
                move2(ee11,ef12,eg13);

            } else {
                Toast.makeText(this, "INVALID MOVE", Toast.LENGTH_SHORT).show();
            }}

        else if (other.getId() == ge3.getId()) {
            if (fe6.getWeightSum() != 1 && ee11.getWeightSum() !=fe6.getWeightSum()&&ge3.getWeightSum()==1) {
                move2(ee11,fe6,ge3);

            } else {
                Toast.makeText(this, "INVALID MOVE", Toast.LENGTH_SHORT).show();
            }}
        else if (other.getId() == gc1.getId()) {
            if (fd5.getWeightSum() != 1 && ee11.getWeightSum() !=fd5.getWeightSum()&&gc1.getWeightSum()==1) {
                move2(ee11, fd5,gc1);

            } else {
                Toast.makeText(this, "INVALID MOVE", Toast.LENGTH_SHORT).show();
            }}


        else if (other.getId() == ed10.getId()) {
            if (ed10.getWeightSum() == 1) {
                move1(ee11,ed10);

            } else {
                Toast.makeText(this, "INVALID MOVE", Toast.LENGTH_SHORT).show();
            }}

        else if (other.getId() == de18.getId()) {
            if (de18.getWeightSum() == 1) {
                move1(ee11,de18);

            } else {
                Toast.makeText(this, "INVALID MOVE", Toast.LENGTH_SHORT).show();
            }}
        else if (other.getId() == ef12.getId()) {
            if (ef12.getWeightSum() == 1) {
                move1(ee11,ef12);

            } else {
                Toast.makeText(this, "INVALID MOVE", Toast.LENGTH_SHORT).show();
            }}
        else if (other.getId() == fe6.getId()) {
            if (fe6.getWeightSum() == 1) {
                move1(ee11,fe6);

            } else {
                Toast.makeText(this, "INVALID MOVE", Toast.LENGTH_SHORT).show();
            }}
        else {
            Toast.makeText(this, "INVALID MOVE", Toast.LENGTH_SHORT).show();
        }
    }

    void swapef12(LinearLayout other) {
        if (other.getId() == ed10.getId()) {
            if (ee11.getWeightSum() != 1 && ef12.getWeightSum() != ee11.getWeightSum()&&ed10.getWeightSum()==1) {
                move2(ef12, ee11,ed10);

            } else {
                Toast.makeText(this, "INVALID MOVE", Toast.LENGTH_SHORT).show();
            }
        } else if (other.getId() == cd24.getId()) {
            if (de18.getWeightSum() != 1 && de18.getWeightSum() != ef12.getWeightSum()&&cd24.getWeightSum()==1) {
                move2(ef12, de18, cd24);

            } else {
                Toast.makeText(this, "INVALID MOVE", Toast.LENGTH_SHORT).show();
            }
        } else if (other.getId() == cf26.getId()) {
            if (df19.getWeightSum() != 1 && df19.getWeightSum() != ef12.getWeightSum()&&cf26.getWeightSum()==1) {
                move2(ef12, df19, cf26);

            } else {
                Toast.makeText(this, "INVALID MOVE", Toast.LENGTH_SHORT).show();
            }}
        else if (other.getId() == gd2.getId()) {
            if (fe6.getWeightSum() != 1 && fe6.getWeightSum() != ef12.getWeightSum()&&gd2.getWeightSum()==1) {
                move2(ef12, df19,gd2);

            } else {
                Toast.makeText(this, "INVALID MOVE", Toast.LENGTH_SHORT).show();
            }}
        else if (other.getId() == ee11.getId()) {
            if (ee11.getWeightSum() == 1) {
                move1(ef12, ee11);

            } else {
                Toast.makeText(this, "INVALID MOVE", Toast.LENGTH_SHORT).show();
            }}

        else if (other.getId() == df19.getId()) {
            if (df19.getWeightSum() == 1) {
                move1(ef12, df19);

            } else {
                Toast.makeText(this, "INVALID MOVE", Toast.LENGTH_SHORT).show();
            }}
        else if (other.getId() == eg13.getId()) {
            if (eg13.getWeightSum() == 1) {
                move1(ef12,eg13);

            } else {
                Toast.makeText(this, "INVALID MOVE", Toast.LENGTH_SHORT).show();
            }}
        else {
            Toast.makeText(this, "INVALID MOVE", Toast.LENGTH_SHORT).show();
        }
    }

    void swapeeg13(LinearLayout other) {
        if (other.getId() == ee11.getId()) {
            if (ef12.getWeightSum() != 1 && ef12.getWeightSum() != eg13.getWeightSum()&&ee11.getWeightSum()==1) {
                move2(eg13, ef12, ee11);

            } else {
                Toast.makeText(this, "INVALID MOVE", Toast.LENGTH_SHORT).show();
            }
        } else if (other.getId() == ce25.getId()) {
            if (df19.getWeightSum() != 1 &&df19.getWeightSum() != eg13.getWeightSum()&&ce25.getWeightSum()==1) {
                move2(eg13, df19, ce25);

            } else {
                Toast.makeText(this, "INVALID MOVE", Toast.LENGTH_SHORT).show();
            }
        } else if (other.getId() ==cg27.getId()) {
            if (dg20.getWeightSum() != 1 && dg20.getWeightSum() != eg13.getWeightSum()&&cg27.getWeightSum()==1) {
                move2(eg13, dg20, cg27);

            } else {
                Toast.makeText(this, "INVALID MOVE", Toast.LENGTH_SHORT).show();
            }}
        else if (other.getId() ==ef12.getId()) {
            if (ef12.getWeightSum() == 1) {
                move1(eg13,ef12);

            } else {
                Toast.makeText(this, "INVALID MOVE", Toast.LENGTH_SHORT).show();
            }}

        else if (other.getId() == dg20.getId()) {
            if (dg20.getWeightSum() == 1) {
                move1(eg13,dg20);

            } else {
                Toast.makeText(this, "INVALID MOVE", Toast.LENGTH_SHORT).show();
            }}
        else {
            Toast.makeText(this, "INVALID MOVE", Toast.LENGTH_SHORT).show();
        }
    }

    void swapeda14(LinearLayout other) {
        if (other.getId() ==bc28.getId()) {
            if (cb22.getWeightSum() != 1 &&cb22.getWeightSum() != da14.getWeightSum()&&bc28.getWeightSum()==1) {
                move2(da14, cb22, bc28);

            } else {
                Toast.makeText(this, "INVALID MOVE", Toast.LENGTH_SHORT).show();
            }
        } else if (other.getId() == dc16.getId()) {
            if (db15.getWeightSum() != 1 && db15.getWeightSum() != da14.getWeightSum()&&dc16.getWeightSum()==1) {
                move2(da14, db15,dc16);

            } else {
                Toast.makeText(this, "INVALID MOVE", Toast.LENGTH_SHORT).show();
            }
        } else if (other.getId() == fc4.getId()) {
            if (eb8.getWeightSum() != 1 && eb8.getWeightSum() != da14.getWeightSum()&&fc4.getWeightSum()==1) {
                move2(da14, eb8, fc4);

            } else {
                Toast.makeText(this, "INVALID MOVE", Toast.LENGTH_SHORT).show();
            }}
        else if (other.getId() == ca21.getId()) {
            if (ca21.getWeightSum() == 1) {
                move1(da14, ca21);

            } else {
                Toast.makeText(this, "INVALID MOVE", Toast.LENGTH_SHORT).show();
            }}

        else if (other.getId() == db15.getId()) {
            if (db15.getWeightSum() == 1) {
                move1(da14, db15);

            } else {
                Toast.makeText(this, "INVALID MOVE", Toast.LENGTH_SHORT).show();
            }}
        else if (other.getId() == ea7.getId()) {
            if (ea7.getWeightSum() == 1) {
                move1(da14, ea7);

            } else {
                Toast.makeText(this, "INVALID MOVE", Toast.LENGTH_SHORT).show();
            }}
        else {
            Toast.makeText(this, "INVALID MOVE", Toast.LENGTH_SHORT).show();
        }
    }


    void swapedb15(LinearLayout other) {
        if (other.getId() == bd29.getId()) {
            if (cc23.getWeightSum() != 1 &&cc23.getWeightSum() != db15.getWeightSum()&&bd29.getWeightSum()==1) {
                move2(db15,cc23,bd29);

            } else {
                Toast.makeText(this, "INVALID MOVE", Toast.LENGTH_SHORT).show();
            }
        } else if (other.getId() == dd17.getId()) {
            if (dc16.getWeightSum() != 1 && dc16.getWeightSum() != db15.getWeightSum()&&dd17.getWeightSum()==1) {
                move2(db15, dc16, dd17);

            } else {
                Toast.makeText(this, "INVALID MOVE", Toast.LENGTH_SHORT).show();
            }
        } else if (other.getId() ==fd5.getId()) {
            if (ec9.getWeightSum() != 1 && ec9.getWeightSum() != db15.getWeightSum()&&fd5.getWeightSum()==1) {
                move2(db15, ec9,  fd5);

            } else {
                Toast.makeText(this, "INVALID MOVE", Toast.LENGTH_SHORT).show();
            }}
        else if (other.getId() == da14.getId()) {
            if ( da14.getWeightSum() == 1) {
                move1(db15,  da14);

            } else {
                Toast.makeText(this, "INVALID MOVE", Toast.LENGTH_SHORT).show();
            }}

        else if (other.getId() ==cb22.getId()) {
            if (cb22.getWeightSum() == 1) {
                move1(db15,cb22);

            } else {
                Toast.makeText(this, "INVALID MOVE", Toast.LENGTH_SHORT).show();
            }}
        else if (other.getId() == dc16.getId()) {
            if ( dc16.getWeightSum() == 1) {
                move1(db15,  dc16);

            } else {
                Toast.makeText(this, "INVALID MOVE", Toast.LENGTH_SHORT).show();
            }}

        else if (other.getId() ==eb8.getId()) {
            if (eb8.getWeightSum() == 1) {
                move1(db15,eb8);

            } else {
                Toast.makeText(this, "INVALID MOVE", Toast.LENGTH_SHORT).show();
            }}
        else {
            Toast.makeText(this, "INVALID MOVE", Toast.LENGTH_SHORT).show();
        }
    }

    void swapedc16(LinearLayout other) {
        if (other.getId() == da14.getId()) {
            if (db15.getWeightSum() != 1 &&db15.getWeightSum() != dc16.getWeightSum()&& da14.getWeightSum()==1) {
                move2(dc16,db15,  da14);

            } else {
                Toast.makeText(this, "INVALID MOVE", Toast.LENGTH_SHORT).show();
            }
        } else if (other.getId() ==bc28.getId()) {
            if (cc23.getWeightSum() != 1 && cc23.getWeightSum() != dc16.getWeightSum()&&bc28.getWeightSum()==1) {
                move2(dc16, cc23,bc28);

            } else {
                Toast.makeText(this, "INVALID MOVE", Toast.LENGTH_SHORT).show();
            }

        } else if (other.getId() == de18.getId()) {
            if (dd17.getWeightSum() != 1 && dd17.getWeightSum() != dc16.getWeightSum()&& de18.getWeightSum()==1) {
                move2(dc16,dd17, de18);

            } else {
                Toast.makeText(this, "INVALID MOVE", Toast.LENGTH_SHORT).show();
            }}
        else if (other.getId() == be30.getId()) {
            if (cd24.getWeightSum() != 1 && cd24.getWeightSum() != dc16.getWeightSum()&& be30.getWeightSum()==1) {
                move2(dc16,cd24, be30);

            } else {
                Toast.makeText(this, "INVALID MOVE", Toast.LENGTH_SHORT).show();
            }}
        else if (other.getId() == fe6.getId()) {
            if (ed10.getWeightSum() != 1 && ed10.getWeightSum() != dc16.getWeightSum()&&fe6.getWeightSum()==1) {
                move2(dc16,ed10,fe6);

            } else {
                Toast.makeText(this, "INVALID MOVE", Toast.LENGTH_SHORT).show();
            }}
        else if (other.getId() == fc4.getId()) {
            if (ec9.getWeightSum() != 1 && ec9.getWeightSum() != dc16.getWeightSum()&&fc4.getWeightSum()==1) {
                move2(dc16,ec9,fc4);

            } else {
                Toast.makeText(this, "INVALID MOVE", Toast.LENGTH_SHORT).show();
            }}





        else if (other.getId() == db15.getId()) {
            if (db15.getWeightSum() == 1) {
                move1(dc16,db15);

            } else {
                Toast.makeText(this, "INVALID MOVE", Toast.LENGTH_SHORT).show();
            }}

        else if (other.getId() == cc23.getId()) {
            if (cc23.getWeightSum() == 1) {
                move1(dc16,cc23);

            } else {
                Toast.makeText(this, "INVALID MOVE", Toast.LENGTH_SHORT).show();
            }}
        else if (other.getId() == dd17.getId()) {
            if (dd17.getWeightSum() == 1) {
                move1(dc16,dd17);

            } else {
                Toast.makeText(this, "INVALID MOVE", Toast.LENGTH_SHORT).show();
            }}
        else if (other.getId() == ec9.getId()) {
            if (fe6.getWeightSum() == 1) {
                move1(dc16,ec9);

            } else {
                Toast.makeText(this, "INVALID MOVE", Toast.LENGTH_SHORT).show();
            }}
        else {
            Toast.makeText(this, "INVALID MOVE", Toast.LENGTH_SHORT).show();
        }
    }



    void swapedd17(LinearLayout other) {
        if (other.getId() == db15.getId()) {
            if (dc16.getWeightSum() != 1 && dd17.getWeightSum() != dc16.getWeightSum()&&db15.getWeightSum()==1) {
                move2(dd17, dc16, db15);

            } else {
                Toast.makeText(this, "INVALID MOVE", Toast.LENGTH_SHORT).show();
            }
        } else if (other.getId() == bd29.getId()) {
            if (cd24.getWeightSum() != 1 && cd24.getWeightSum() != dd17.getWeightSum()&&bd29.getWeightSum()==1) {
                move2(dd17, cd24, bd29);

            } else {
                Toast.makeText(this, "INVALID MOVE", Toast.LENGTH_SHORT).show();
            }
        } else if (other.getId() == df19.getId()) {
            if (de18.getWeightSum() != 1 && de18.getWeightSum() !=dd17.getWeightSum()&&df19.getWeightSum()==1) {
                move2(dd17, de18,df19);

            } else {
                Toast.makeText(this, "INVALID MOVE", Toast.LENGTH_SHORT).show();
            }}
        else if (other.getId() == fd5.getId()) {
            if (ed10.getWeightSum() != 1 && ed10.getWeightSum() != dd17.getWeightSum()&&fd5.getWeightSum()==1) {
                move2(dd17,ed10,fd5);

            } else {
                Toast.makeText(this, "INVALID MOVE", Toast.LENGTH_SHORT).show();
            }}
        else if (other.getId() == dc16.getId()) {
            if (dc16.getWeightSum() == 1) {
                move1(dd17,dc16);

            } else {
                Toast.makeText(this, "INVALID MOVE", Toast.LENGTH_SHORT).show();
            }}

        else if (other.getId() == cd24.getId()) {
            if (cd24.getWeightSum() == 1) {
                move1(dd17, cd24);

            } else {
                Toast.makeText(this, "INVALID MOVE", Toast.LENGTH_SHORT).show();
            }}
        else if (other.getId() ==de18.getId()) {
            if (de18.getWeightSum() == 1) {
                move1(dd17, de18);

            } else {
                Toast.makeText(this, "INVALID MOVE", Toast.LENGTH_SHORT).show();
            }}
        else if (other.getId() == ed10.getId()) {
            if (ed10.getWeightSum() == 1) {
                move1(dd17, ed10);

            } else {
                Toast.makeText(this, "INVALID MOVE", Toast.LENGTH_SHORT).show();
            }}
        else {
            Toast.makeText(this, "INVALID MOVE", Toast.LENGTH_SHORT).show();
        }
    }

    void swapede18(LinearLayout other) {
        if (other.getId() == dc16.getId()) {
            if (dd17.getWeightSum() != 1 && dd17.getWeightSum() !=de18.getWeightSum()&& dc16.getWeightSum()==1) {
                move2(de18,dd17,  dc16);

            } else {
                Toast.makeText(this, "INVALID MOVE", Toast.LENGTH_SHORT).show();
            }
        } else if (other.getId() == bc28.getId()) {
            if (cd24.getWeightSum() != 1 && cd24.getWeightSum() != de18.getWeightSum()&&bc28.getWeightSum()==1) {
                move2(de18, cd24,bc28);

            } else {
                Toast.makeText(this, "INVALID MOVE", Toast.LENGTH_SHORT).show();
            }
        } else if (other.getId() == be30.getId()) {
            if (ce25.getWeightSum() != 1 && ce25.getWeightSum() != de18.getWeightSum()&& be30.getWeightSum()==1) {
                move2(de18, ce25, be30);

            } else {
                Toast.makeText(this, "INVALID MOVE", Toast.LENGTH_SHORT).show();
            }}
        else if (other.getId() == dg20.getId()) {
            if (df19.getWeightSum() != 1 && df19.getWeightSum() !=de18.getWeightSum()&& dg20.getWeightSum()==1) {
                move2(de18,df19,dg20);

            } else {
                Toast.makeText(this, "INVALID MOVE", Toast.LENGTH_SHORT).show();
            }}
        else if (other.getId() ==fe6.getId()) {
            if (ee11.getWeightSum() != 1 && ee11.getWeightSum() != de18.getWeightSum()&& fe6.getWeightSum()==1) {
                move2(de18,ee11,fe6);

            } else {
                Toast.makeText(this, "INVALID MOVE", Toast.LENGTH_SHORT).show();
            }}
        else if (other.getId() ==fc4.getId()) {
            if (ed10.getWeightSum() != 1 && ed10.getWeightSum() != de18.getWeightSum()&& fc4.getWeightSum()==1) {
                move2(de18,ed10,fc4);

            } else {
                Toast.makeText(this, "INVALID MOVE", Toast.LENGTH_SHORT).show();
            }}
        else if (other.getId() == ge3.getId()) {
            if (fe6.getWeightSum() != 1 && ee11.getWeightSum() !=de18.getWeightSum()&&ge3.getWeightSum()==1) {
                move2(de18,fe6,ge3);

            } else {
                Toast.makeText(this, "INVALID MOVE", Toast.LENGTH_SHORT).show();
            }}
        else if (other.getId() == gc1.getId()) {
            if (fd5.getWeightSum() != 1 && ee11.getWeightSum() !=de18.getWeightSum()&&gc1.getWeightSum()==1) {
                move2(de18, fd5,gc1);

            } else {
                Toast.makeText(this, "INVALID MOVE", Toast.LENGTH_SHORT).show();
            }}


        else if (other.getId() == dd17.getId()) {
            if (dd17.getWeightSum() == 1) {
                move1(de18,dd17);

            } else {
                Toast.makeText(this, "INVALID MOVE", Toast.LENGTH_SHORT).show();
            }}

        else if (other.getId() == ce25.getId()) {
            if (ce25.getWeightSum() == 1) {
                move1(de18,ce25);

            } else {
                Toast.makeText(this, "INVALID MOVE", Toast.LENGTH_SHORT).show();
            }}
        else if (other.getId() == df19.getId()) {
            if (df19.getWeightSum() == 1) {
                move1(de18,df19);

            } else {
                Toast.makeText(this, "INVALID MOVE", Toast.LENGTH_SHORT).show();
            }}
        else if (other.getId() == ee11.getId()) {
            if (ee11.getWeightSum() == 1) {
                move1(de18,ee11);

            } else {
                Toast.makeText(this, "INVALID MOVE", Toast.LENGTH_SHORT).show();
            }}
        else {
            Toast.makeText(this, "INVALID MOVE", Toast.LENGTH_SHORT).show();
        }
    }

    void swapedf19(LinearLayout other) {
        if (other.getId() == dd17.getId()) {
            if (de18.getWeightSum() != 1 && de18.getWeightSum() != df19.getWeightSum()&&dd17.getWeightSum()==1) {
                move2(df19,de18, dd17);

            } else {
                Toast.makeText(this, "INVALID MOVE", Toast.LENGTH_SHORT).show();
            }
        } else if (other.getId() == bd29.getId()) {
            if (ce25.getWeightSum() != 1 && ce25.getWeightSum() != df19.getWeightSum()&&bd29.getWeightSum()==1) {
                move2(df19, ce25,bd29);

            } else {
                Toast.makeText(this, "INVALID MOVE", Toast.LENGTH_SHORT).show();
            }
        } else if (other.getId() == fd5.getId()) {
            if (ee11.getWeightSum() != 1 && ee11.getWeightSum() != df19.getWeightSum()&&fd5.getWeightSum()==1) {
                move2(df19, ee11, fd5);

            } else {
                Toast.makeText(this, "INVALID MOVE", Toast.LENGTH_SHORT).show();
            }}
        else if (other.getId() ==de18.getId()) {
            if (de18.getWeightSum() == 1) {
                move1(df19, de18);

            } else {
                Toast.makeText(this, "INVALID MOVE", Toast.LENGTH_SHORT).show();
            }}

        else if (other.getId() == cf26.getId()) {
            if (cf26.getWeightSum() == 1) {
                move1(df19, cf26);

            } else {
                Toast.makeText(this, "INVALID MOVE", Toast.LENGTH_SHORT).show();
            }}
        else if (other.getId() ==dg20.getId()) {
            if (dg20.getWeightSum() == 1) {
                move1(df19,dg20);

            } else {
                Toast.makeText(this, "INVALID MOVE", Toast.LENGTH_SHORT).show();
            }}

        else if (other.getId() == ef12.getId()) {
            if (ef12.getWeightSum() == 1) {
                move1(df19,ef12);

            } else {
                Toast.makeText(this, "INVALID MOVE", Toast.LENGTH_SHORT).show();
            }}
        else {
            Toast.makeText(this, "INVALID MOVE", Toast.LENGTH_SHORT).show();
        }

    }


    void swapedg20(LinearLayout other) {
        if (other.getId() == de18.getId()) {
            if (df19.getWeightSum() != 1 && df19.getWeightSum() != dg20.getWeightSum()&&de18.getWeightSum()==1) {
                move2(dg20,df19, de18);

            } else {
                Toast.makeText(this, "INVALID MOVE", Toast.LENGTH_SHORT).show();
            }
        } else if (other.getId() == be30.getId()) {
            if (cf26.getWeightSum() != 1 && cf26.getWeightSum() != dg20.getWeightSum()&& be30.getWeightSum()==1) {
                move2(dg20, cf26, be30);

            } else {
                Toast.makeText(this, "INVALID MOVE", Toast.LENGTH_SHORT).show();
            }
        } else if (other.getId() == fe6.getId()) {
            if (ef12.getWeightSum() != 1 &&ef12.getWeightSum() !=dg20.getWeightSum()&&fe6.getWeightSum()==1) {
                move2(dg20, ef12,fe6);

            } else {
                Toast.makeText(this, "INVALID MOVE", Toast.LENGTH_SHORT).show();
            }}
        else if (other.getId() ==df19.getId()) {
            if (df19.getWeightSum() == 1) {
                move1(dg20, df19);

            } else {
                Toast.makeText(this, "INVALID MOVE", Toast.LENGTH_SHORT).show();
            }}

        else if (other.getId() == cg27.getId()) {
            if (cg27.getWeightSum() == 1) {
                move1(dg20, cg27);

            } else {
                Toast.makeText(this, "INVALID MOVE", Toast.LENGTH_SHORT).show();
            }}
        else if (other.getId() ==eg13.getId()) {
            if (eg13.getWeightSum() == 1) {
                move1(dg20,eg13);

            } else {
                Toast.makeText(this, "INVALID MOVE", Toast.LENGTH_SHORT).show();
            }}


        else {
            Toast.makeText(this, "INVALID MOVE", Toast.LENGTH_SHORT).show();
        }

    }
    void swapeca21(LinearLayout other) {
        if (other.getId() == cc23.getId()) {
            if (cb22.getWeightSum() != 1 && cb22.getWeightSum() != ca21.getWeightSum()&&cc23.getWeightSum()==1) {
                move2(ca21, cb22, cc23);

            } else {
                Toast.makeText(this, "INVALID MOVE", Toast.LENGTH_SHORT).show();
            }
        } else if (other.getId() == ec9.getId()) {
            if (db15.getWeightSum() != 1 && db15.getWeightSum() != ca21.getWeightSum()&&ec9.getWeightSum()==1) {
                move2(ca21,db15, ec9);

            } else {
                Toast.makeText(this, "INVALID MOVE", Toast.LENGTH_SHORT).show();
            }
        } else if (other.getId() == ea7.getId()) {
            if (da14.getWeightSum() != 1 && da14.getWeightSum() != ca21.getWeightSum()&&ea7.getWeightSum()==1) {
                move2(ca21,da14,ea7);

            } else {
                Toast.makeText(this, "INVALID MOVE", Toast.LENGTH_SHORT).show();
            }}
        else if (other.getId() == cb22.getId()) {
            if (cb22.getWeightSum() == 1) {
                move1(ca21,cb22);

            } else {
                Toast.makeText(this, "INVALID MOVE", Toast.LENGTH_SHORT).show();
            }}

        else if (other.getId() ==da14.getId()) {
            if (da14.getWeightSum() == 1) {
                move1(ca21, da14);

            } else {
                Toast.makeText(this, "INVALID MOVE", Toast.LENGTH_SHORT).show();
            }}
        else {
            Toast.makeText(this, "INVALID MOVE", Toast.LENGTH_SHORT).show();
        }
    }

    void swapecb22(LinearLayout other) {
        if (other.getId() == ad32.getId()) {
            if (bc28.getWeightSum() != 1 &&bc28.getWeightSum() != cb22.getWeightSum()&&ad32.getWeightSum()==1) {
                move2(cb22, bc28, ad32);

            } else {
                Toast.makeText(this, "INVALID MOVE", Toast.LENGTH_SHORT).show();
            }
        } else if (other.getId() == cd24.getId()) {
            if (cc23.getWeightSum() != 1 && cc23.getWeightSum() != cb22.getWeightSum()&&cd24.getWeightSum()==1) {
                move2(cb22, cc23, cd24);

            } else {
                Toast.makeText(this, "INVALID MOVE", Toast.LENGTH_SHORT).show();
            }
        } else if (other.getId() == ed10.getId()) {
            if (dc16.getWeightSum() != 1 && dc16.getWeightSum() !=cb22.getWeightSum()&&ed10.getWeightSum()==1) {
                move2(cb22, dc16, ed10);

            } else {
                Toast.makeText(this, "INVALID MOVE", Toast.LENGTH_SHORT).show();
            }}
        else if (other.getId() == eb8.getId()) {
            if (db15.getWeightSum() != 1 &&db15.getWeightSum() !=cb22.getWeightSum()&&eb8.getWeightSum()==1) {
                move2(cb22,db15, eb8);

            } else {
                Toast.makeText(this, "INVALID MOVE", Toast.LENGTH_SHORT).show();
            }}
        else if (other.getId() == cc23.getId()) {
            if (cc23.getWeightSum() == 1) {
                move1(cb22, cc23);

            } else {
                Toast.makeText(this, "INVALID MOVE", Toast.LENGTH_SHORT).show();
            }}

        else if (other.getId() ==ca21.getId()) {
            if (ca21.getWeightSum() == 1) {
                move1(cb22, ca21);

            } else {
                Toast.makeText(this, "INVALID MOVE", Toast.LENGTH_SHORT).show();
            }}
        else if (other.getId() == db15.getId()) {
            if (db15.getWeightSum() == 1) {
                move1(cb22, db15);

            } else {
                Toast.makeText(this, "INVALID MOVE", Toast.LENGTH_SHORT).show();
            }}
        else {
            Toast.makeText(this, "INVALID MOVE", Toast.LENGTH_SHORT).show();
        }
    }


    void swapecc23(LinearLayout other) {
        if (other.getId() == ca21.getId()) {
            if (cb22.getWeightSum() != 1 && cb22.getWeightSum() != cc23.getWeightSum()&& ca21.getWeightSum()==1) {
                move2(cc23,cb22,  ca21);

            } else {
                Toast.makeText(this, "INVALID MOVE", Toast.LENGTH_SHORT).show();
            }
        } else if (other.getId() == ac31.getId()) {
            if (bc28.getWeightSum() != 1 && bc28.getWeightSum() != cc23.getWeightSum()&&ac31.getWeightSum()==1) {
                move2(cc23, bc28,ac31);

            } else {
                Toast.makeText(this, "INVALID MOVE", Toast.LENGTH_SHORT).show();
            }
        } else if (other.getId() == ae33.getId()) {
            if (bd29.getWeightSum() != 1 &&bd29.getWeightSum() != cc23.getWeightSum()&& ae33.getWeightSum()==1) {
                move2(cc23, bd29,ae33);

            } else {
                Toast.makeText(this, "INVALID MOVE", Toast.LENGTH_SHORT).show();
            }}
        else if (other.getId() == ce25.getId()) {
            if (cd24.getWeightSum() != 1 && cd24.getWeightSum() != cc23.getWeightSum()&&ce25.getWeightSum()==1) {
                move2(cc23,cd24,ce25);

            } else {
                Toast.makeText(this, "INVALID MOVE", Toast.LENGTH_SHORT).show();
            }}
        else if (other.getId() == ee11.getId()) {
            if (dd17.getWeightSum() != 1 && dd17.getWeightSum() != cc23.getWeightSum()&& ee11.getWeightSum()==1) {
                move2(cc23,dd17,ee11);

            } else {
                Toast.makeText(this, "INVALID MOVE", Toast.LENGTH_SHORT).show();
            }}

        else if (other.getId() == ec9.getId()) {
            if (dc16.getWeightSum() != 1 && dc16.getWeightSum() !=cc23.getWeightSum()&& ec9.getWeightSum()==1) {
                move2(cc23,dc16, ec9);

            } else {
                Toast.makeText(this, "INVALID MOVE", Toast.LENGTH_SHORT).show();
            }}
        else if (other.getId() ==ea7.getId()) {
            if (db15.getWeightSum() != 1 && db15.getWeightSum() !=cc23.getWeightSum()&&ea7.getWeightSum()==1) {
                move2(cc23, db15,ea7);

            } else {
                Toast.makeText(this, "INVALID MOVE", Toast.LENGTH_SHORT).show();
            }}


        else if (other.getId() == cb22.getId()) {
            if (cb22.getWeightSum() == 1) {
                move1(cc23,cb22);

            } else {
                Toast.makeText(this, "INVALID MOVE", Toast.LENGTH_SHORT).show();
            }}

        else if (other.getId() == bc28.getId()) {
            if (bc28.getWeightSum() == 1) {
                move1(cc23,bc28);

            } else {
                Toast.makeText(this, "INVALID MOVE", Toast.LENGTH_SHORT).show();
            }}
        else if (other.getId() == cd24.getId()) {
            if (cd24.getWeightSum() == 1) {
                move1(cc23,cd24);

            } else {
                Toast.makeText(this, "INVALID MOVE", Toast.LENGTH_SHORT).show();
            }}
        else if (other.getId() == dc16.getId()) {
            if (dc16.getWeightSum() == 1) {
                move1(cc23,dc16);

            } else {
                Toast.makeText(this, "INVALID MOVE", Toast.LENGTH_SHORT).show();
            }}
        else {
            Toast.makeText(this, "INVALID MOVE", Toast.LENGTH_SHORT).show();
        }
    }
    void swapecd24(LinearLayout other) {
        if (other.getId() ==cb22.getId()) {
            if (cc23.getWeightSum() != 1 && cc23.getWeightSum() != cd24.getWeightSum()&& cb22.getWeightSum()==1) {
                move2(cd24,cc23,  cb22);

            } else {
                Toast.makeText(this, "INVALID MOVE", Toast.LENGTH_SHORT).show();
            }
        } else if (other.getId() == ad32.getId()) {
            if (bd29.getWeightSum() != 1 && bd29.getWeightSum() != cd24.getWeightSum()&&ad32.getWeightSum()==1) {
                move2(cd24, bd29,ad32);

            } else {
                Toast.makeText(this, "INVALID MOVE", Toast.LENGTH_SHORT).show();
            }
        } else if (other.getId() == cf26.getId()) {
            if (ce25.getWeightSum() != 1 &&ce25.getWeightSum() != cd24.getWeightSum()&&  cf26.getWeightSum()==1) {
                move2(cd24, ce25, cf26);

            } else {
                Toast.makeText(this, "INVALID MOVE", Toast.LENGTH_SHORT).show();
            }}
        else if (other.getId() == ef12.getId()) {
            if (de18.getWeightSum() != 1 && de18.getWeightSum() != cd24.getWeightSum()&&ef12.getWeightSum()==1) {
                move2(cd24,de18,ef12);

            } else {
                Toast.makeText(this, "INVALID MOVE", Toast.LENGTH_SHORT).show();
            }}
        else if (other.getId() == ed10.getId()) {
            if (dd17.getWeightSum() != 1 && dd17.getWeightSum() != cd24.getWeightSum()&& ed10.getWeightSum()==1) {
                move2(cd24,dd17,ed10);

            } else {
                Toast.makeText(this, "INVALID MOVE", Toast.LENGTH_SHORT).show();
            }}

        else if (other.getId() == eb8.getId()) {
            if (dc16.getWeightSum() != 1 && dc16.getWeightSum() !=cd24.getWeightSum()&& eb8.getWeightSum()==1) {
                move2(cd24,dc16, eb8);

            } else {
                Toast.makeText(this, "INVALID MOVE", Toast.LENGTH_SHORT).show();
            }}
        else if (other.getId() == dd17.getId()) {
            if (dd17.getWeightSum() == 1) {
                move1(cd24,dd17);

            } else {
                Toast.makeText(this, "INVALID MOVE", Toast.LENGTH_SHORT).show();
            }}



        else if (other.getId() == cc23.getId()) {
            if (cc23.getWeightSum() == 1) {
                move1(cd24,cc23);

            } else {
                Toast.makeText(this, "INVALID MOVE", Toast.LENGTH_SHORT).show();
            }}
        else if (other.getId() == bd29.getId()) {
            if (bd29.getWeightSum() == 1) {
                move1(cd24,bd29);

            } else {
                Toast.makeText(this, "INVALID MOVE", Toast.LENGTH_SHORT).show();
            }}
        else if (other.getId() == ce25.getId()) {
            if (ce25.getWeightSum() == 1) {
                move1(cd24,ce25);

            } else {
                Toast.makeText(this, "INVALID MOVE", Toast.LENGTH_SHORT).show();
            }}
        else {
            Toast.makeText(this, "INVALID MOVE", Toast.LENGTH_SHORT).show();
        }
    }
    void swapece25(LinearLayout other) {
        if (other.getId() == cc23.getId()) {
            if (cd24.getWeightSum() != 1 && cd24.getWeightSum() != ce25.getWeightSum()&&  cc23.getWeightSum()==1) {
                move2(ce25,cd24,   cc23);

            } else {
                Toast.makeText(this, "INVALID MOVE", Toast.LENGTH_SHORT).show();
            }
        } else if (other.getId() == ac31.getId()) {
            if (bd29.getWeightSum() != 1 && bd29.getWeightSum() != ce25.getWeightSum()&&ac31.getWeightSum()==1) {
                move2(ce25,bd29,ac31);

            } else {
                Toast.makeText(this, "INVALID MOVE", Toast.LENGTH_SHORT).show();
            }
        } else if (other.getId() == ae33.getId()) {
            if (be30.getWeightSum() != 1 &&be30.getWeightSum() != ce25.getWeightSum()&& ae33.getWeightSum()==1) {
                move2(ce25, be30,ae33);

            } else {
                Toast.makeText(this, "INVALID MOVE", Toast.LENGTH_SHORT).show();
            }}
        else if (other.getId() == cg27.getId()) {
            if (cf26.getWeightSum() != 1 && cf26.getWeightSum() != ce25.getWeightSum()&&cg27.getWeightSum()==1) {
                move2(ce25,cf26,cg27);

            } else {
                Toast.makeText(this, "INVALID MOVE", Toast.LENGTH_SHORT).show();
            }}
        else if (other.getId() == eg13.getId()) {
            if (df19.getWeightSum() != 1 && df19.getWeightSum() != ce25.getWeightSum()&& eg13.getWeightSum()==1) {
                move2(ce25,df19,eg13);

            } else {
                Toast.makeText(this, "INVALID MOVE", Toast.LENGTH_SHORT).show();
            }}

        else if (other.getId() == ee11.getId()) {
            if (de18.getWeightSum() != 1 && de18.getWeightSum() !=ce25.getWeightSum()&& ee11.getWeightSum()==1) {
                move2(ce25,de18, ee11);

            } else {
                Toast.makeText(this, "INVALID MOVE", Toast.LENGTH_SHORT).show();
            }}
        else if (other.getId() ==ec9.getId()) {
            if (dd17.getWeightSum() != 1 && dd17.getWeightSum() !=ce25.getWeightSum()&&ec9.getWeightSum()==1) {
                move2(ce25,dd17,ec9);

            } else {
                Toast.makeText(this, "INVALID MOVE", Toast.LENGTH_SHORT).show();
            }}


        else if (other.getId() ==cd24.getId()) {
            if (cd24.getWeightSum() == 1) {
                move1(ce25,cd24);

            } else {
                Toast.makeText(this, "INVALID MOVE", Toast.LENGTH_SHORT).show();
            }}

        else if (other.getId() == cf26.getId()) {
            if (cf26.getWeightSum() == 1) {
                move1(ce25,cf26);

            } else {
                Toast.makeText(this, "INVALID MOVE", Toast.LENGTH_SHORT).show();
            }}
        else if (other.getId() == de18.getId()) {
            if (de18.getWeightSum() == 1) {
                move1(ce25,de18);

            } else {
                Toast.makeText(this, "INVALID MOVE", Toast.LENGTH_SHORT).show();
            }}
        else if (other.getId() == be30.getId()) {
            if (be30.getWeightSum() == 1) {
                move1(ce25,be30);

            } else {
                Toast.makeText(this, "INVALID MOVE", Toast.LENGTH_SHORT).show();
            }}
        else {
            Toast.makeText(this, "INVALID MOVE", Toast.LENGTH_SHORT).show();
        }
    }
    void swapecf26(LinearLayout other) {
        if (other.getId() == cd24.getId()) {
            if (ce25.getWeightSum() != 1 &&ce25.getWeightSum() != cf26.getWeightSum()&&cd24.getWeightSum()==1) {
                move2(cf26,ce25, cd24);

            } else {
                Toast.makeText(this, "INVALID MOVE", Toast.LENGTH_SHORT).show();
            }
        } else if (other.getId() == ad32.getId()) {
            if (be30.getWeightSum() != 1 && be30.getWeightSum() != cf26.getWeightSum()&&ad32.getWeightSum()==1) {
                move2(cf26,be30, ad32);

            } else {
                Toast.makeText(this, "INVALID MOVE", Toast.LENGTH_SHORT).show();
            }
        } else if (other.getId() == ef12.getId()) {
            if (df19.getWeightSum() != 1 && df19.getWeightSum() !=cf26.getWeightSum()&&ef12.getWeightSum()==1) {
                move2(cf26,df19,ef12);

            } else {
                Toast.makeText(this, "INVALID MOVE", Toast.LENGTH_SHORT).show();
            }}
        else if (other.getId() == ed10.getId()) {
            if (de18.getWeightSum() != 1 &&de18.getWeightSum() !=cf26.getWeightSum()&&ed10.getWeightSum()==1) {
                move2(cf26,de18,ed10);

            } else {
                Toast.makeText(this, "INVALID MOVE", Toast.LENGTH_SHORT).show();
            }}
        else if (other.getId() == ce25.getId()) {
            if (ce25.getWeightSum() == 1) {
                move1(cf26,ce25);

            } else {
                Toast.makeText(this, "INVALID MOVE", Toast.LENGTH_SHORT).show();
            }}

        else if (other.getId() ==df19.getId()) {
            if (df19.getWeightSum() == 1) {
                move1(cf26, df19);

            } else {
                Toast.makeText(this, "INVALID MOVE", Toast.LENGTH_SHORT).show();
            }}
        else if (other.getId() == cg27.getId()) {
            if (cg27.getWeightSum() == 1) {
                move1(cf26, cg27);

            } else {
                Toast.makeText(this, "INVALID MOVE", Toast.LENGTH_SHORT).show();
            }}
        else {
            Toast.makeText(this, "INVALID MOVE", Toast.LENGTH_SHORT).show();
        }
    }
    void swapecg27(LinearLayout other) {
        if (other.getId() == ce25.getId()) {
            if (cf26.getWeightSum() != 1 && cf26.getWeightSum() != fc4.getWeightSum()&&ce25.getWeightSum()==1) {
                move2(cg27, cf26,ce25);

            } else {
                Toast.makeText(this, "INVALID MOVE", Toast.LENGTH_SHORT).show();
            }
        } else if (other.getId() == ee11.getId()) {
            if (df19.getWeightSum() != 1 && df19.getWeightSum() !=cg27.getWeightSum()&&ee11.getWeightSum()==1) {
                move2(cg27,df19, ee11);

            } else {
                Toast.makeText(this, "INVALID MOVE", Toast.LENGTH_SHORT).show();
            }
        } else if (other.getId() == eg13.getId()) {
            if (dg20.getWeightSum() != 1 &&dg20.getWeightSum() != cg27.getWeightSum()&&eg13.getWeightSum()==1) {
                move2(cg27, dg20, eg13);

            } else {
                Toast.makeText(this, "INVALID MOVE", Toast.LENGTH_SHORT).show();
            }}
        else if (other.getId() == dg20.getId()) {
            if (dg20.getWeightSum() == 1) {
                move1(cg27, dg20);

            } else {
                Toast.makeText(this, "INVALID MOVE", Toast.LENGTH_SHORT).show();
            }}

        else if (other.getId() == cf26.getId()) {
            if (cf26.getWeightSum() == 1) {
                move1(cg27, cf26);

            } else {
                Toast.makeText(this, "INVALID MOVE", Toast.LENGTH_SHORT).show();
            }}
        else {
            Toast.makeText(this, "INVALID MOVE", Toast.LENGTH_SHORT).show();
        }
    }
    void swapebc28(LinearLayout other) {
        if (other.getId() == da14.getId()) {
            if (cb22.getWeightSum() != 1 &&cb22.getWeightSum() != bc28.getWeightSum()&&da14.getWeightSum()==1) {
                move2(bc28,cb22, da14);

            } else {
                Toast.makeText(this, "INVALID MOVE", Toast.LENGTH_SHORT).show();
            }
        } else if (other.getId() == dc16.getId()) {
            if (cc23.getWeightSum() != 1 && cc23.getWeightSum() != bc28.getWeightSum()&&dc16.getWeightSum()==1) {
                move2(bc28, cc23,dc16);

            } else {
                Toast.makeText(this, "INVALID MOVE", Toast.LENGTH_SHORT).show();
            }
        } else if (other.getId() == be30.getId()) {
            if (bd29.getWeightSum() != 1 && bd29.getWeightSum() !=bc28.getWeightSum()&&be30.getWeightSum()==1) {
                move2(bc28, bd29,be30);

            } else {
                Toast.makeText(this, "INVALID MOVE", Toast.LENGTH_SHORT).show();
            }}
        else if (other.getId() == de18.getId()) {
            if (cd24.getWeightSum() != 1 &&cd24.getWeightSum() !=bc28.getWeightSum()&&de18.getWeightSum()==1) {
                move2(bc28,cd24, de18);

            } else {
                Toast.makeText(this, "INVALID MOVE", Toast.LENGTH_SHORT).show();
            }}
        else if (other.getId() == ac31.getId()) {
            if (ac31.getWeightSum() == 1) {
                move1(bc28, ac31);

            } else {
                Toast.makeText(this, "INVALID MOVE", Toast.LENGTH_SHORT).show();
            }}

        else if (other.getId() ==bd29.getId()) {
            if (bd29.getWeightSum() == 1) {
                move1(bc28, bd29);

            } else {
                Toast.makeText(this, "INVALID MOVE", Toast.LENGTH_SHORT).show();
            }}
        else if (other.getId() ==cc23.getId()) {
            if (cc23.getWeightSum() == 1) {
                move1(bc28, cc23);

            } else {
                Toast.makeText(this, "INVALID MOVE", Toast.LENGTH_SHORT).show();
            }}
        else {
            Toast.makeText(this, "INVALID MOVE", Toast.LENGTH_SHORT).show();
        }
    }
    void swapebd29(LinearLayout other) {
        if (other.getId() ==db15.getId()) {
            if (cc23.getWeightSum() != 1 &&cc23.getWeightSum() != bd29.getWeightSum()&&db15.getWeightSum()==1) {
                move2(bd29,cc23,db15);

            } else {
                Toast.makeText(this, "INVALID MOVE", Toast.LENGTH_SHORT).show();
            }
        } else if (other.getId() == dd17.getId()) {
            if (cd24.getWeightSum() != 1 && cd24.getWeightSum() != bd29.getWeightSum()&&dd17.getWeightSum()==1) {
                move2(bd29,cd24, dd17);

            } else {
                Toast.makeText(this, "INVALID MOVE", Toast.LENGTH_SHORT).show();
            }
        } else if (other.getId() ==df19.getId()) {
            if (ce25.getWeightSum() != 1 && ce25.getWeightSum() != bd29.getWeightSum()&&df19.getWeightSum()==1) {
                move2(bd29, ce25, df19);

            } else {
                Toast.makeText(this, "INVALID MOVE", Toast.LENGTH_SHORT).show();
            }}
        else if (other.getId() == bc28.getId()) {
            if (  bc28.getWeightSum() == 1) {
                move1(bd29,  bc28);

            } else {
                Toast.makeText(this, "INVALID MOVE", Toast.LENGTH_SHORT).show();
            }}

        else if (other.getId() ==ad32.getId()) {
            if (ad32.getWeightSum() == 1) {
                move1(bd29,ad32);

            } else {
                Toast.makeText(this, "INVALID MOVE", Toast.LENGTH_SHORT).show();
            }}
        else if (other.getId() == be30.getId()) {
            if ( be30.getWeightSum() == 1) {
                move1(bd29, be30);

            } else {
                Toast.makeText(this, "INVALID MOVE", Toast.LENGTH_SHORT).show();
            }}

        else if (other.getId() ==cd24.getId()) {
            if (cd24.getWeightSum() == 1) {
                move1(bd29,cd24);

            } else {
                Toast.makeText(this, "INVALID MOVE", Toast.LENGTH_SHORT).show();
            }}
        else {
            Toast.makeText(this, "INVALID MOVE", Toast.LENGTH_SHORT).show();
        }
    }

    void swapebe30(LinearLayout other) {
        if (other.getId() == bc28.getId()) {
            if (bd29.getWeightSum() != 1 &&bd29.getWeightSum() != be30.getWeightSum()&&bc28.getWeightSum()==1) {
                move2(be30,bd29, bc28);

            } else {
                Toast.makeText(this, "INVALID MOVE", Toast.LENGTH_SHORT).show();
            }
        } else if (other.getId() == dc16.getId()) {
            if (cd24.getWeightSum() != 1 && cd24.getWeightSum() != be30.getWeightSum()&&dc16.getWeightSum()==1) {
                move2(be30, cd24,dc16);

            } else {
                Toast.makeText(this, "INVALID MOVE", Toast.LENGTH_SHORT).show();
            }
        } else if (other.getId() == de18.getId()) {
            if (ce25.getWeightSum() != 1 && ce25.getWeightSum() !=be30.getWeightSum()&&de18.getWeightSum()==1) {
                move2(be30,ce25,de18);

            } else {
                Toast.makeText(this, "INVALID MOVE", Toast.LENGTH_SHORT).show();
            }}
        else if (other.getId() ==dg20.getId()) {
            if (cf26.getWeightSum() != 1 &&cf26.getWeightSum() !=be30.getWeightSum()&&dg20.getWeightSum()==1) {
                move2(be30,cf26, dg20);

            } else {
                Toast.makeText(this, "INVALID MOVE", Toast.LENGTH_SHORT).show();
            }}
        else if (other.getId() == ce25.getId()) {
            if (ce25.getWeightSum() == 1) {
                move1(be30,ce25);

            } else {
                Toast.makeText(this, "INVALID MOVE", Toast.LENGTH_SHORT).show();
            }}

        else if (other.getId() ==bd29.getId()) {
            if (bd29.getWeightSum() == 1) {
                move1(be30, bd29);

            } else {
                Toast.makeText(this, "INVALID MOVE", Toast.LENGTH_SHORT).show();
            }}
        else if (other.getId() ==ae33.getId()) {
            if (ae33.getWeightSum() == 1) {
                move1(be30, ae33);

            } else {
                Toast.makeText(this, "INVALID MOVE", Toast.LENGTH_SHORT).show();
            }}
        else {
            Toast.makeText(this, "INVALID MOVE", Toast.LENGTH_SHORT).show();
        }
    }


    void swapeac31(LinearLayout other) {
        if (other.getId() ==cc23.getId()) {
            if (bc28.getWeightSum() != 1 && bc28.getWeightSum() != ac31.getWeightSum()&&cc23.getWeightSum()==1) {
                move2(ac31, bc28, cc23);

            } else {
                Toast.makeText(this, "INVALID MOVE", Toast.LENGTH_SHORT).show();
            }
        } else if (other.getId() == ce25.getId()) {
            if (bd29.getWeightSum() != 1 && bd29.getWeightSum() != ac31.getWeightSum()&&ce25.getWeightSum()==1) {
                move2(ac31, bd29,ce25);

            } else {
                Toast.makeText(this, "INVALID MOVE", Toast.LENGTH_SHORT).show();
            }
        } else if (other.getId() == ae33.getId()) {
            if (ad32.getWeightSum() != 1 && ad32.getWeightSum() != ac31.getWeightSum()&&ae33.getWeightSum()==1) {
                move2(ac31, ad32,ae33);

            } else {
                Toast.makeText(this, "INVALID MOVE", Toast.LENGTH_SHORT).show();
            }}
        else if (other.getId() ==ad32.getId()) {
            if (ad32.getWeightSum() == 1) {
                move1(ac31, ad32);

            } else {
                Toast.makeText(this, "INVALID MOVE", Toast.LENGTH_SHORT).show();
            }}

        else if (other.getId() ==bc28.getId()) {
            if (bc28.getWeightSum() == 1) {
                move1(ac31,bc28);

            } else {
                Toast.makeText(this, "INVALID MOVE", Toast.LENGTH_SHORT).show();
            }}
        else {
            Toast.makeText(this, "INVALID MOVE", Toast.LENGTH_SHORT).show();
        }
    }
    void swapead32(LinearLayout other) {
        if (other.getId() == cb22.getId()) {
            if (bc28.getWeightSum() != 1 && bc28.getWeightSum() != ad32.getWeightSum()&&cb22.getWeightSum()==1) {
                move2(ad32,bc28, cb22);

            } else {
                Toast.makeText(this, "INVALID MOVE", Toast.LENGTH_SHORT).show();
            }
        } else if (other.getId() == cd24.getId()) {
            if (bd29.getWeightSum() != 1 && bd29.getWeightSum() != ad32.getWeightSum()&& cd24.getWeightSum()==1) {
                move2(ad32, bd29, cd24);

            } else {
                Toast.makeText(this, "INVALID MOVE", Toast.LENGTH_SHORT).show();
            }
        } else if (other.getId() == cf26.getId()) {
            if (be30.getWeightSum() != 1 &&be30.getWeightSum() !=ad32.getWeightSum()&&cf26.getWeightSum()==1) {
                move2(ad32, be30,cf26);

            } else {
                Toast.makeText(this, "INVALID MOVE", Toast.LENGTH_SHORT).show();
            }}
        else if (other.getId() ==ac31.getId()) {
            if (ac31.getWeightSum() == 1) {
                move1(ad32, ac31);

            } else {
                Toast.makeText(this, "INVALID MOVE", Toast.LENGTH_SHORT).show();
            }}

        else if (other.getId() == ae33.getId()) {
            if (ae33.getWeightSum() == 1) {
                move1(ad32, ae33);

            } else {
                Toast.makeText(this, "INVALID MOVE", Toast.LENGTH_SHORT).show();
            }}
        else if (other.getId() ==bd29.getId()) {
            if (bd29.getWeightSum() == 1) {
                move1(ad32,bd29);

            } else {
                Toast.makeText(this, "INVALID MOVE", Toast.LENGTH_SHORT).show();
            }}


        else {
            Toast.makeText(this, "INVALID MOVE", Toast.LENGTH_SHORT).show();
        }

    }


    void swapeae33(LinearLayout other) {
        if (other.getId() ==ac31.getId()) {
            if (ad32.getWeightSum() != 1 && ad32.getWeightSum() != ae33.getWeightSum()&&ac31.getWeightSum()==1) {
                move2(ae33,ad32, ac31);

            } else {
                Toast.makeText(this, "INVALID MOVE", Toast.LENGTH_SHORT).show();
            }
        } else if (other.getId() == cc23.getId()) {
            if (bd29.getWeightSum() != 1 && bd29.getWeightSum() != ae33.getWeightSum()&& cc23.getWeightSum()==1) {
                move2(ae33, bd29, cc23);

            } else {
                Toast.makeText(this, "INVALID MOVE", Toast.LENGTH_SHORT).show();
            }
        } else if (other.getId() == ce25.getId()) {
            if (be30.getWeightSum() != 1 && be30.getWeightSum() !=ae33.getWeightSum()&&ce25.getWeightSum()==1) {
                move2(ae33, be30,ce25);

            } else {
                Toast.makeText(this, "INVALID MOVE", Toast.LENGTH_SHORT).show();
            }}
        else if (other.getId() ==ad32.getId()) {
            if (ad32.getWeightSum() == 1) {
                move1(ae33, ad32);

            } else {
                Toast.makeText(this, "INVALID MOVE", Toast.LENGTH_SHORT).show();
            }}

        else if (other.getId() ==be30.getId()) {
            if (be30.getWeightSum() == 1) {
                move1(ae33,be30);

            } else {
                Toast.makeText(this, "INVALID MOVE", Toast.LENGTH_SHORT).show();
            }}
        else {
            Toast.makeText(this, "INVALID MOVE", Toast.LENGTH_SHORT).show();
        }
    }

    @Override
    public void onBackPressed() {
     Intent i=new Intent(MainActivityP.this,Start.class);

            startActivity(i);}
    private void showAlertred() {
        final Dialog dialog = new Dialog(this);
        dialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
        dialog.setContentView(R.layout.redlayout);

        dialog.show();

        boolean result = false;
        // final EditText etPin = (EditText) dialog.findViewById(R.id.et_pin);
        final TextView name =  dialog.findViewById(R.id.name);
        final ImageView image =  dialog.findViewById(R.id.image);
     name.setText(getIntent().getStringExtra("second")+" wins");

      image.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(MainActivityP.this,MainActivityP.class);

                startActivity(i);
            }
        });


    }
    private void showAlertyellow() {
        final Dialog dialog = new Dialog(this);
        dialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
        dialog.setContentView(R.layout.yellowlayout);

        dialog.show();

        boolean result = false;
        // final EditText etPin = (EditText) dialog.findViewById(R.id.et_pin);
        final TextView name =  dialog.findViewById(R.id.name);
        final ImageView image =  dialog.findViewById(R.id.image);
        name.setText(getIntent().getStringExtra("first")+" wins");

        image.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(MainActivityP.this,MainActivityP.class);

                startActivity(i);
            }
        });


    }
    void timer1(){

       c= new CountDownTimer(30000, 1000) {

            public void onTick(long millisUntilFinished) {
               timer.setText(""+ millisUntilFinished / 1000);
                //here you can have your logic to set text to edittext
            }

            public void onFinish() {if(move==1)
            {  color2(start);
            move=0;
                swap();
                timer1();}else{
              swap();
              timer1();
            }}

        }.start();}
        void timer2(){ c.cancel(); // cancel
           c.start();  }

}