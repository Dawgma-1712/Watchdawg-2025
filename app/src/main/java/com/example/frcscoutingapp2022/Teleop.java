package com.example.frcscoutingapp2022;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


public class Teleop extends Fragment implements View.OnClickListener{

    //initialize variables
    private TextView TeleopL1Text;
    private TextView TeleopL2Text;
    private TextView TeleopL3Text;
    private TextView TeleopL4Text;
    private TextView TeleopBargeText;
    private TextView TeleopProcessorText;
    private TextView TeleopDeReefedText;

    //counter variables
    private int TeleopL1Counter = 0;
    private int TeleopL2Counter = 0;
    private int TeleopL3Counter = 0;
    private int TeleopL4Counter = 0;
    private int TeleopBargeCounter = 0;
    private int TeleopProcessorCounter = 0;
    private int TeleopDeReefedCounter = 0;

    //Teleop Varibles
    public static int TeleopL1 = 0;
    public static int TeleopL2 = 0;
    public static int TeleopL3 = 0;
    public static int TeleopL4 = 0;
    public static int TeleopBarge = 0;
    public static int TeleopProcessor = 0;
    public static int TeleopDeReefed = 0;

    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view =  inflater.inflate(R.layout.fragment_teleop, container, false);


        //Define TextViews
        TeleopL1Text = (TextView) view.findViewById(R.id.TeleopL1Counter);
        TeleopL2Text = (TextView) view.findViewById(R.id.TeleopL2Counter);
        TeleopL4Text = (TextView) view.findViewById(R.id.TeleopL4Counter);
        TeleopL3Text = (TextView) view.findViewById(R.id.TeleopL3Counter);
        TeleopBargeText = (TextView) view.findViewById(R.id.TeleopBargeCounter);
        TeleopProcessorText = (TextView) view.findViewById(R.id.TeleopProcessorCounter);
        TeleopDeReefedText = (TextView) view.findViewById(R.id.TeleopDeReefedCounter);






        //Amp buttons Listener
        view.findViewById(R.id.TeleopL1Increase).setOnClickListener(this);
        view.findViewById(R.id.TeleopL1Decrease).setOnClickListener(this);

        view.findViewById(R.id.TeleopL2Increase).setOnClickListener(this);
        view.findViewById(R.id.TeleopL2Decrease).setOnClickListener(this);

        //Speaker buttons Listener
        view.findViewById(R.id.TeleopL3Increase).setOnClickListener(this);
        view.findViewById(R.id.TeleopL3Decrease).setOnClickListener(this);

        view.findViewById(R.id.TeleopL4Increase).setOnClickListener(this);
        view.findViewById(R.id.TeleopL4Decrease).setOnClickListener(this);

        view.findViewById(R.id.TeleopBargeIncrease).setOnClickListener(this);
        view.findViewById(R.id.TeleopBargeDecrease).setOnClickListener(this);

        view.findViewById(R.id.TeleopDeReefedIncrease).setOnClickListener(this);
        view.findViewById(R.id.TeleopDeReefedDecrease).setOnClickListener(this);

        view.findViewById(R.id.TeleopProcessorIncrease).setOnClickListener(this);
        view.findViewById(R.id.TeleopProcessorDecrease).setOnClickListener(this);

        //Teleop
        TeleopL1 = 0;
        TeleopL2 = 0;
        TeleopL3 = 0;
        TeleopL4 = 0;
        TeleopBarge = 0;
        TeleopProcessor = 0;
        TeleopDeReefed = 0;

        return view;
    }



    @Override
    public void onClick(View view) {
        //runs the buttons
        switch(view.getId()){
            case R.id.TeleopL1Increase:
                System.out.println(MainActivity.checkBoxData);
                TeleopL1Counter++;
                TeleopL1Text.setText(Integer.toString(TeleopL1Counter));
                //MainActivity.editMatchData(1, 0, MainActivity.getButtonData()[0][0] + 1);
                Teleop.TeleopL1++;
                break;

            case R.id.TeleopL1Decrease:
                if(TeleopL1Counter > 0) {
                    TeleopL1Counter--;
                    TeleopL1Text.setText(Integer.toString(TeleopL1Counter));
                    //MainActivity.editMatchData(1, 0, MainActivity.getButtonData()[0][0] - 1);
                    Teleop.TeleopL1--;
                } break;

            case R.id.TeleopL2Increase:
                TeleopL2Counter++;
                TeleopL2Text.setText(Integer.toString(TeleopL2Counter));
                //MainActivity.editMatchData(1, 1, MainActivity.getButtonData()[0][1] + 1);
                Teleop.TeleopL2++;
                break;

            case R.id.TeleopL2Decrease:
                if(TeleopL2Counter > 0) {
                    TeleopL2Counter--;
                    TeleopL2Text.setText(Integer.toString(TeleopL2Counter));
                    //MainActivity.editMatchData(1, 1, MainActivity.getButtonData()[0][1] - 1);
                    Teleop.TeleopL2--;
                } break;

            case R.id.TeleopL3Increase:
                TeleopL3Counter++;
                TeleopL3Text.setText(Integer.toString(TeleopL3Counter));
                //MainActivity.editMatchData(1, 2, MainActivity.getButtonData()[0][2] + 1);
                Teleop.TeleopL3++;
                System.out.println(Teleop.TeleopL3);
                break;

            case R.id.TeleopL3Decrease:
                if(TeleopL3Counter > 0) {
                    TeleopL3Counter--;
                    TeleopL3Text.setText(Integer.toString(TeleopL3Counter));
                    //MainActivity.editMatchData(1, 2, MainActivity.getButtonData()[0][2] - 1);
                    Teleop.TeleopL3--;
                    System.out.println(Teleop.TeleopL3);

                } break;

            case R.id.TeleopL4Increase:
                TeleopL4Counter++;
                TeleopL4Text.setText(Integer.toString(TeleopL4Counter));
                //MainActivity.editMatchData(1, 3, MainActivity.getButtonData()[0][3] + 1);
                Teleop.TeleopL4++;
                break;

            case R.id.TeleopL4Decrease:
                if(TeleopL4Counter > 0) {
                    TeleopL4Counter--;
                    TeleopL4Text.setText(Integer.toString(TeleopL4Counter));
                    //MainActivity.editMatchData(1, 3, MainActivity.getButtonData()[0][3] - 1);
                    Teleop.TeleopL4--;
                } break;
            case R.id.TeleopBargeIncrease:
                TeleopBargeCounter++;
                TeleopBargeText.setText(Integer.toString(TeleopBargeCounter));
                //MainActivity.editMatchData(1, 3, MainActivity.getButtonData()[0][3] + 1);
                Teleop.TeleopBarge++;
                break;

            case R.id.TeleopBargeDecrease:
                if(TeleopBargeCounter > 0) {
                    TeleopBargeCounter--;
                    TeleopBargeText.setText(Integer.toString(TeleopBargeCounter));
                    //MainActivity.editMatchData(1, 3, MainActivity.getButtonData()[0][3] - 1);
                    Teleop.TeleopBarge--;
                } break;
            case R.id.TeleopDeReefedIncrease:
                TeleopDeReefedCounter++;
                TeleopDeReefedText.setText(Integer.toString(TeleopDeReefedCounter));
                //MainActivity.editMatchData(1, 3, MainActivity.getButtonData()[0][3] + 1);
                Teleop.TeleopDeReefed++;
                break;

            case R.id.TeleopDeReefedDecrease:
                if(TeleopDeReefedCounter > 0) {
                    TeleopDeReefedCounter--;
                    TeleopDeReefedText.setText(Integer.toString(TeleopDeReefedCounter));
                    //MainActivity.editMatchData(1, 3, MainActivity.getButtonData()[0][3] - 1);
                    Teleop.TeleopDeReefed--;
                } break;
            case R.id.TeleopProcessorIncrease:
                TeleopProcessorCounter++;
                TeleopProcessorText.setText(Integer.toString(TeleopProcessorCounter));
                //MainActivity.editMatchData(1, 3, MainActivity.getButtonData()[0][3] + 1);
                Teleop.TeleopProcessor++;
                break;

            case R.id.TeleopProcessorDecrease:
                if(TeleopProcessorCounter > 0) {
                    TeleopProcessorCounter--;
                    TeleopProcessorText.setText(Integer.toString(TeleopProcessorCounter));
                    //MainActivity.editMatchData(1, 3, MainActivity.getButtonData()[0][3] - 1);
                    Teleop.TeleopProcessor--;
                } break;


        }
    }

    public void onResume(){
        super.onResume();
        // IDK
        TeleopL1Text.setText(Integer.toString(TeleopL1Counter));
        TeleopL2Text.setText(Integer.toString(TeleopL2Counter));
        TeleopL4Text.setText(Integer.toString(TeleopL4Counter));
        TeleopL3Text.setText(Integer.toString(TeleopL3Counter));
        TeleopBargeText.setText(Integer.toString(TeleopBargeCounter));
        TeleopProcessorText.setText(Integer.toString(TeleopProcessorCounter));
        TeleopDeReefedText.setText(Integer.toString(TeleopDeReefedCounter));
    }

    public void clear(){
        //reset
        TeleopL1Text.setText(Integer.toString(0));
        TeleopL2Text.setText(Integer.toString(0));
        TeleopL4Text.setText(Integer.toString(0));
        TeleopL3Text.setText(Integer.toString(0));
        TeleopBargeText.setText(Integer.toString(0));
        TeleopDeReefedText.setText(Integer.toString(0));
        TeleopProcessorText.setText(Integer.toString(0));

        TeleopL1Counter = 0;
        TeleopL2Counter = 0;
        TeleopL3Counter = 0;
        TeleopL4Counter = 0;
        TeleopBargeCounter = 0;
        TeleopDeReefedCounter = 0;
        TeleopProcessorCounter = 0;


    }





}
