package com.example.midtermcajoteflores;

import android.app.slice.Slice;
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
 * Use the {@link desserts#newInstance} factory method to
 * create an instance of this fragment.
 */
public class desserts extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public desserts() {
        // Required empty public constructor
    }
    // TODO: Rename and change types and number of parameters
    public static desserts newInstance(String param1, String param2) {
        desserts fragment = new desserts();
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
        View v =  inflater.inflate(R.layout.fragment_desserts, container, false);
        Button IceCream = (Button) v.findViewById(R.id.btnIceCream);
        Button CokeFloat = (Button) v.findViewById(R.id.btnCokeFloat);
        Button SliceOfCake = (Button) v.findViewById(R.id.btnSliceOfCake);
        Button Cookies = (Button) v.findViewById(R.id.btnCookies);
        Button Donuts = (Button) v.findViewById(R.id.btnDonuts);

        IceCream.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getActivity(),"Ice Cream ADDED to CART", Toast.LENGTH_LONG).show();
            }
        });
        CokeFloat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getActivity(),"Coke Float ADD CART", Toast.LENGTH_LONG).show();
            }
        });
        SliceOfCake.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getActivity(),"Slice of Cake ADD CART", Toast.LENGTH_LONG).show();
            }
        });
        Cookies.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getActivity(),"Cookies ADD CART", Toast.LENGTH_LONG).show();
            }
        });
        Donuts.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getActivity(),"Donuts ADD CART", Toast.LENGTH_LONG).show();
            }
        });
        return v;
    }
    public void add_to_list (View view){
        if(view == view.findViewById(R.id.btnIceCream)){
            choice = choice + " Ice Cream "+ "\n";
            price = price+100;
        }
        if(view == view.findViewById(R.id.btnCokeFloat)){
            choice = choice + " Coke Float "+ "\n";
            price = price+10;
        }
        if(view == view.findViewById(R.id.btnSliceOfCake)){
            choice = choice + " Slice Of Cake "+ "\n";
            price = price+60;
        }
        if(view == view.findViewById(R.id.btnCookies)){
            choice = choice + " Cookies "+ "\n";
            price = price+60;
        }
        if(view == view.findViewById(R.id.btnDonuts)){
            choice = choice + " Donuts "+ "\n";
            price = price+60;
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