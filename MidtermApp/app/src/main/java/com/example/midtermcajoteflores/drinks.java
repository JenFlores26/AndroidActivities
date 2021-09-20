package com.example.midtermcajoteflores;

import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link drinks#newInstance} factory method to
 * create an instance of this fragment.
 */
public class drinks extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public drinks() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment drinks.
     */
    // TODO: Rename and change types and number of parameters
    public static drinks newInstance(String param1, String param2) {
        drinks fragment = new drinks();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }
    public String choice = "";
    public Double price = 0.00;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v =  inflater.inflate(R.layout.fragment_drinks, container, false);
        Button IceTea = (Button) v.findViewById(R.id.btnIceTea);
        Button SoftDrink = (Button) v.findViewById(R.id.btnSoftdrink);
        Button Juice = (Button) v.findViewById(R.id.btnJuice);
        Button Water = (Button) v.findViewById(R.id.btnWater);
        Button MilkTea = (Button) v.findViewById(R.id.btnMilkTea);

        IceTea.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getActivity(),"Ice Tea ADDED to CART", Toast.LENGTH_LONG).show();
            }
        });
        SoftDrink.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getActivity(),"Soft Drink ADD CART", Toast.LENGTH_LONG).show();
            }
        });
        Juice.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getActivity(),"Juice ADD CART", Toast.LENGTH_LONG).show();
            }
        });
        Water.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getActivity(),"Water ADD CART", Toast.LENGTH_LONG).show();
            }
        });
        MilkTea.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getActivity(),"Milk Tea ADD CART", Toast.LENGTH_LONG).show();
            }
        });
        return v;
    }

    public void add_to_list (View view){
        if(view == view.findViewById(R.id.btnIceTea)){
            choice = choice + " Ice Tea "+ "\n";
            price = price+100;
        }
        if(view == view.findViewById(R.id.btnSoftdrink)){
            choice = choice + " Soft Drink "+ "\n";
            price = price+10;
        }
        if(view == view.findViewById(R.id.btnJuice)){
            choice = choice + " Juice "+ "\n";
            price = price+60;
        }
        if(view == view.findViewById(R.id.btnWater)){
            choice = choice + " Water "+ "\n";
            price = price+60;
        }
        if(view == view.findViewById(R.id.btnMilkTea)){
            choice = choice + " Milk Tea "+ "\n";
            price = price+60;
            //Toast.makeText(getActivity(),"French Fries ADD CART", Toast.LENGTH_LONG).show();
        }
    }

    public void placeOrder(View view){
        Intent i = new Intent(getActivity(), addCart.class);
        Bundle bundle = new Bundle();
        bundle.putString("choice",choice);
        bundle.putDouble("price",price);
        i.putExtras(bundle);
        startActivity(i);
    }
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
    }
}