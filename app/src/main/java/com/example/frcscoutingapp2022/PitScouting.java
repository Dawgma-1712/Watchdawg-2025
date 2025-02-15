package com.example.frcscoutingapp2022;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;

import android.Manifest;
import android.annotation.SuppressLint;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.MultiFormatWriter;
import com.google.zxing.WriterException;
import com.google.zxing.common.BitMatrix;
import com.journeyapps.barcodescanner.BarcodeEncoder;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class PitScouting extends AppCompatActivity implements View.OnClickListener {
    private String data = "";
    private Bitmap bitmap;

    //Varibles
    private static EditText TeamNumPit;
    private static EditText Weight;
    private static EditText DriveMotors;
    private static EditText WheelType;
    private static EditText DriveType;
    private static EditText robotLength;
    private static EditText RobotWidth;
    private static String locationScoringCoral = "";
    private static EditText climbingFeatures;
    private static EditText autoRoutine;
    private static EditText notesOnRobot;
    private static EditText robotName;

    //PitScouting varibles
    public static int L1;
    public static int L2;
    public static int L3;
    public static int L4;
    public static String intakeMethod="";
    public static String locationScoringAlgae="";
    public static String abilityToClimb="";



    private static ImageView iv_output2;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pit_scouting);



        findViewById(R.id.pitScoutingSave).setOnClickListener(this);
        findViewById(R.id.newActivityPitScouting).setOnClickListener(this);


        //initializing text varibles
        TeamNumPit = (EditText) findViewById(R.id.TeamNumPit);
        Weight = (EditText) findViewById(R.id.Weight);
        DriveMotors = (EditText) findViewById(R.id.DriveMotors);
        robotLength = (EditText) findViewById(R.id.robotLength);
        RobotWidth = (EditText) findViewById(R.id.RobotWidth);
        climbingFeatures = (EditText) findViewById(R.id.climbingFeatures);
        autoRoutine = (EditText) findViewById(R.id.autoRoutine);
        notesOnRobot = (EditText) findViewById(R.id.notesOnRobot);
        WheelType = (EditText) findViewById(R.id.WheelType);
        DriveType = (EditText) findViewById(R.id.DriveType);
        robotName = (EditText) findViewById(R.id.robotName);

        iv_output2 = findViewById(R.id.iv_output2);



    }

    @Override
    public void onClick(View view) {
        switch(view.getId()){

            case R.id.pitScoutingSave:
                if(L1==1) locationScoringCoral +="L1-";
                if(L2==1) locationScoringCoral +="L2-";
                if(L3==1) locationScoringCoral +="L3-";
                if(L4==1) locationScoringCoral +="L4";
                //save QR code
                data = TeamNumPit.getText().toString() + ","+Weight.getText().toString()+","+DriveMotors.getText().toString()+","+WheelType.getText().toString()+","+DriveType.getText().toString()+","+robotLength.getText().toString()+","+
                        RobotWidth.getText().toString()+","+ locationScoringCoral+","+ locationScoringAlgae+","+ abilityToClimb+","+ climbingFeatures.getText().toString()+","+
                        intakeMethod+","+autoRoutine.getText().toString()+","+notesOnRobot.getText().toString()+","+robotName.getText().toString();

                //Initialize multi format writer
                MultiFormatWriter writer = new MultiFormatWriter();
                try {
                    BitMatrix matrix = writer.encode(data, BarcodeFormat.QR_CODE, 600, 600);
                    BarcodeEncoder encoder = new BarcodeEncoder();
                    bitmap = encoder.createBitmap(matrix);
                    iv_output2.setImageBitmap(bitmap);

                    if (Build.VERSION.SDK_INT >= 23) {
                        if (checkSelfPermission(Manifest.permission.WRITE_EXTERNAL_STORAGE)
                            == PackageManager.PERMISSION_GRANTED){
                            saveImage(bitmap, TeamNumPit.getText().toString() + "pit_scouting.png");
                        }
                        else {
                            ActivityCompat.requestPermissions(PitScouting.this, new String[] {Manifest.permission.WRITE_EXTERNAL_STORAGE}, 1);
                        }
                    }


                } catch(WriterException e){
                    e.printStackTrace();
                }

                break;
            case R.id.newActivityPitScouting:
                L1=0;
                L2=0;
                L3=0;
                L4=0;
                intakeMethod="";
                locationScoringCoral="";
                locationScoringAlgae="";
                abilityToClimb="";
                startActivity(new Intent(this, HomeScreen.class));
                break;

        }
    }
    public void onCheckBoxClicked(View view) {
        // Is view checked
        boolean checked = ((CheckBox) view).isChecked();

        // Check which one clicked
        switch (view.getId()) {
            case R.id.deep:
                if(abilityToClimb.equals("deep")){
                    abilityToClimb = "";
                }
                else if(abilityToClimb.equals("both")){
                    abilityToClimb = "shallow";
                }
                else {
                    if (abilityToClimb.equals("shallow"))
                        abilityToClimb = "both";
                    else abilityToClimb = "deep";
                }
                break;
            case R.id.shallow:
                if(abilityToClimb.equals("shallow")){
                    abilityToClimb = "";
                }
                else if(abilityToClimb.equals("both")){
                    abilityToClimb = "deep";
                }
                else {
                    if (abilityToClimb.equals("deep"))
                        abilityToClimb = "both";
                    else abilityToClimb = "shallow";
                }
                break;
            case R.id.ground:
                if(intakeMethod.equals("ground")){
                    intakeMethod = "";
                }
                else if(intakeMethod.equals("both")){
                    intakeMethod = "human player";
                }
                else {
                    if (intakeMethod.equals("human player"))
                        intakeMethod = "both";
                    else intakeMethod = "ground";
                }
                break;
            case R.id.HP:
                if(intakeMethod.equals("human player")){
                    intakeMethod = "";
                }
                else if(intakeMethod.equals("both")){
                    intakeMethod = "ground";
                }
                else {
                    if (intakeMethod.equals("ground"))
                        intakeMethod = "both";
                    else intakeMethod = "human player";
                }
                break;
            case R.id.barge:
                if(locationScoringAlgae.equals("barge")){
                    locationScoringAlgae = "";
                }
                else if(locationScoringAlgae.equals("both")){
                    locationScoringAlgae = "processor";
                }
                else {
                    if (locationScoringAlgae.equals("processor"))
                        locationScoringAlgae = "both";
                    else locationScoringAlgae = "barge";
                }
                break;
            case R.id.processor:
                if(locationScoringAlgae.equals("processor")){
                    locationScoringAlgae = "";
                }
                else if(locationScoringAlgae.equals("both")){
                    locationScoringAlgae = "barge";
                }
                else {
                    if (locationScoringAlgae.equals("barge"))
                        locationScoringAlgae = "both";
                    else locationScoringAlgae = "processor";
                }
                break;
            case R.id.l1:
                if(L1==1) L1=0;
                else L1=1;
                break;
            case R.id.l2:
                if(L2==1) L2=0;
                else L2=1;
                break;
            case R.id.l3:
                if(L3==1) L3=0;
                else L3=1;
                break;
            case R.id.l4:
                if(L4==1) L4=0;
                else L4=1;
                break;

        }


    }

    private void saveImage(Bitmap bitmap, String name) {
        File mypath = new File("/storage/emulated/0/Download",name);

        FileOutputStream fos = null;
        try{
            fos = new FileOutputStream(mypath);
            bitmap.compress (Bitmap.CompressFormat.PNG, 100, fos);
            Toast.makeText(PitScouting.this, "QR Code saved", Toast.LENGTH_SHORT).show();
        }
        catch (Exception e){
            Toast.makeText(PitScouting.this, "Error saving QR Code to gallery", Toast.LENGTH_SHORT).show();
            e.printStackTrace();
        }
        finally {
            try{
                fos.flush();
                fos.close();
            }
            catch (IOException e){
                e.printStackTrace();
            }
        }

    }
}