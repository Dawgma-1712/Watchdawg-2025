package com.example.frcscoutingapp2022;

import android.annotation.SuppressLint;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


public class Auto extends Fragment implements View.OnClickListener {


    //initialize variables

    //Initialize upper node text views
    private TextView AutoL1Text;
    private TextView AutoL2Text;

    //initialize Middle node text views
    private TextView AutoL3Text;
    private TextView AutoL4Text;
    private TextView AutoBargeText;
    private TextView AutoDeReefedText;
    private TextView AutoProcessorText;


    //counter variables
    private int AutoL1Counter = 0;
    private int AutoL2Counter = 0;
    private int AutoL3Counter = 0;
    private int AutoL4Counter = 0;
    private int AutoBargeCounter = 0;
    private int AutoProcessorCounter = 0;
    private int AutoDeReefedCounter = 0;

    //Auto Varibles
    public static int AutoL1 = 0;
    public static int AutoL2 = 0;
    public static int AutoL3 = 0;
    public static int AutoL4 = 0;
    public static int AutoBarge = 0;
    public static int AutoProcessor = 0;
    public static int AutoDeReefed = 0;
    public static int leave = 0;


    @SuppressLint("MissingInflatedId")
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_auto, container, false);



        //Define TextViews
        AutoL1Text = (TextView) view.findViewById(R.id.AutoL1Counter);
        AutoL2Text = (TextView) view.findViewById(R.id.AutoL2Counter);
        AutoL3Text = (TextView) view.findViewById(R.id.AutoL3Counter);
        AutoL4Text = (TextView) view.findViewById(R.id.AutoL4Counter);
        AutoBargeText = (TextView) view.findViewById(R.id.AutoBargeCounter);
        AutoDeReefedText = (TextView) view.findViewById(R.id.AutoDeReefedCounter);
        AutoProcessorText = (TextView) view.findViewById(R.id.AutoProcessorCounter);



        //Upper Row Buttons
        view.findViewById(R.id.AutoL1Increase).setOnClickListener(this);
        view.findViewById(R.id.AutoL1Decrease).setOnClickListener(this);

        view.findViewById(R.id.AutoL2Increase).setOnClickListener(this);
        view.findViewById(R.id.AutoL2Decrease).setOnClickListener(this);

        //Middle Row Buttons
        view.findViewById(R.id.AutoL3Increase).setOnClickListener(this);
        view.findViewById(R.id.AutoL3Decrease).setOnClickListener(this);

        view.findViewById(R.id.AutoL4Increase).setOnClickListener(this);
        view.findViewById(R.id.AutoL4Decrease).setOnClickListener(this);

        view.findViewById(R.id.AutoBargeIncrease).setOnClickListener(this);
        view.findViewById(R.id.AutoBargeDecrease).setOnClickListener(this);

        view.findViewById(R.id.AutoDeReefedIncrease).setOnClickListener(this);
        view.findViewById(R.id.AutoDeReefedDecrease).setOnClickListener(this);

        view.findViewById(R.id.AutoProcessorIncrease).setOnClickListener(this);
        view.findViewById(R.id.AutoProcessorDecrease).setOnClickListener(this);


        //Auto
        leave = 0;
        AutoL1 = 0;
        AutoL2 = 0;
        AutoL3 = 0;
        AutoL4 = 0;
        AutoBarge = 0;
        AutoDeReefed = 0;
        AutoProcessor = 0;


        return view;
    }
    //stuff that happens when you hit buttons
    @Override
    public void onClick(View view) {
        switch(view.getId()){
            //+1 to upper cone
            case R.id.AutoL1Increase:
                AutoL1Counter++;
                AutoL1Text.setText(Integer.toString(AutoL1Counter));
                //MainActivity.editMatchData(0, 0, MainActivity.getButtonData()[0][0] + 1);
                Auto.AutoL1++;
                break;
            case R.id.AutoL1Decrease:
                if(AutoL1Counter > 0) {
                    AutoL1Counter--;
                    AutoL1Text.setText(Integer.toString(AutoL1Counter));
                    //MainActivity.editMatchData(0, 0, MainActivity.getButtonData()[0][0] - 1);
                    Auto.AutoL1--;
                } break;

            case R.id.AutoL2Increase:
                AutoL2Counter++;
                AutoL2Text.setText(Integer.toString(AutoL2Counter));
                //MainActivity.editMatchData(0, 1, MainActivity.getButtonData()[0][1] + 1);\
                Auto.AutoL2++;

                break;

            case R.id.AutoL2Decrease:
                if(AutoL2Counter > 0) {
                    AutoL2Counter--;
                    AutoL2Text.setText(Integer.toString(AutoL2Counter));
                    //MainActivity.editMatchData(0, 1, MainActivity.getButtonData()[0][1] - 1);
                    Auto.AutoL2--;
                } break;

            case R.id.AutoL3Increase:
                AutoL3Counter++;
                AutoL3Text.setText(Integer.toString(AutoL3Counter));
                //MainActivity.editMatchData(0, 2, MainActivity.getButtonData()[0][2] + 1);
                Auto.AutoL3++;

                break;

            case R.id.AutoL3Decrease:
                if(AutoL3Counter > 0) {
                    AutoL3Counter--;
                    AutoL3Text.setText(Integer.toString(AutoL3Counter));
                    //MainActivity.editMatchData(0, 2, MainActivity.getButtonData()[0][2] - 1);
                    Auto.AutoL3--;
                } break;
            case R.id.AutoL4Increase:
                AutoL4Counter++;
                AutoL4Text.setText(Integer.toString(AutoL4Counter));
                //MainActivity.editMatchData(0, 2, MainActivity.getButtonData()[0][2] + 1);
                Auto.AutoL4++;

                break;

            case R.id.AutoL4Decrease:
                if(AutoL4Counter > 0) {
                    AutoL4Counter--;
                    AutoL4Text.setText(Integer.toString(AutoL4Counter));
                    //MainActivity.editMatchData(0, 2, MainActivity.getButtonData()[0][2] - 1);
                    Auto.AutoL4--;
                } break;
            case R.id.AutoBargeIncrease:
                AutoBargeCounter++;
                AutoBargeText.setText(Integer.toString(AutoBargeCounter));
                //MainActivity.editMatchData(0, 2, MainActivity.getButtonData()[0][2] + 1);
                Auto.AutoBarge++;

                break;

            case R.id.AutoBargeDecrease:
                if(AutoBargeCounter > 0) {
                    AutoBargeCounter--;
                    AutoBargeText.setText(Integer.toString(AutoBargeCounter));
                    //MainActivity.editMatchData(0, 2, MainActivity.getButtonData()[0][2] - 1);
                    Auto.AutoBarge--;
                } break;
            case R.id.AutoDeReefedIncrease:
                AutoDeReefedCounter++;
                AutoDeReefedText.setText(Integer.toString(AutoDeReefedCounter));
                //MainActivity.editMatchData(0, 2, MainActivity.getButtonData()[0][2] + 1);
                Auto.AutoDeReefed++;

                break;

            case R.id.AutoDeReefedDecrease:
                if(AutoDeReefedCounter > 0) {
                    AutoDeReefedCounter--;
                    AutoDeReefedText.setText(Integer.toString(AutoDeReefedCounter));
                    //MainActivity.editMatchData(0, 2, MainActivity.getButtonData()[0][2] - 1);
                    Auto.AutoDeReefed--;
                } break;
            case R.id.AutoProcessorIncrease:
                AutoProcessorCounter++;
                AutoProcessorText.setText(Integer.toString(AutoProcessorCounter));
                //MainActivity.editMatchData(0, 2, MainActivity.getButtonData()[0][2] + 1);
                Auto.AutoProcessor++;

                break;

            case R.id.AutoProcessorDecrease:
                if(AutoProcessorCounter > 0) {
                    AutoProcessorCounter--;
                    AutoProcessorText.setText(Integer.toString(AutoProcessorCounter));
                    //MainActivity.editMatchData(0, 2, MainActivity.getButtonData()[0][2] - 1);
                    Auto.AutoProcessor--;
                } break;



        }
    }

    public void onResume() {
        super.onResume();

        AutoL1Text.setText(Integer.toString(AutoL1Counter));
        AutoL2Text.setText(Integer.toString(AutoL2Counter));
        AutoL3Text.setText(Integer.toString(AutoL3Counter));
        AutoL4Text.setText(Integer.toString(AutoL4Counter));

        AutoBargeText.setText(Integer.toString(AutoBargeCounter));
        AutoDeReefedText.setText(Integer.toString(AutoDeReefedCounter));
        AutoProcessorText.setText(Integer.toString(AutoProcessorCounter));


    }
}
//he he ha ha