package com.example.frcscoutingapp2022;

import android.annotation.SuppressLint;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link endgame#newInstance} factory method to
 * create an instance of this fragment.
 */
public class endgame extends Fragment implements View.OnClickListener {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";
    public static EditText additionalNotesText;


    //Endgame Varibles
    public static int Parking = 0;
    public static int Shallow = 0;
    public static int Deep = 0;
    public static int penalty = 0;
    public static int deadBot = 0;
    public static String additionalNotes;

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public endgame() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment endgame.
     */
    // TODO: Rename and change types and number of parameters
    public static endgame newInstance(String param1, String param2) {
        //IDK
        endgame fragment = new endgame();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        //IDK
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @SuppressLint("MissingInflatedId")
    @Override
   public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_endgame, container, false);
        additionalNotesText = view.findViewById(R.id.additionalNotes);



        //Endgame
        /*    Parking = 0;
        Shallow = 0;
        Deep = 0;
        penalty = 0;
        deadBot = 0; */


        return view;


    }
    public void onClick(View view) {
        switch(view.getId()){
            //+1 to upper cone




        }
    }

}