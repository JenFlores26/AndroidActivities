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
 * Use the {@link foods#newInstance} factory method to
 * create an instance of this fragment.
 */
public class foods extends Fragment {
    public String choice = "";
    public Double price = 0.00;

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public foods() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment foods.
     */
    // TODO: Rename and change types and number of parameters
    public static foods newInstance(String param1, String param2) {
        foods fragment = new foods();
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

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v =  inflater.inflate(R.layout.fragment_foods, container, false);
        Button FriedChicken = (Button) v.findViewById(R.id.btnFriedChicken);
        Button Spaghetti = (Button) v.findViewById(R.id.btnSpag);
        Button BurgerSteak = (Button) v.findViewById(R.id.btnBurgerSteak);
        Button Hamburger = (Button) v.findViewById(R.id.btnHamburger);
        Button FrenchFries = (Button) v.findViewById(R.id.btnfrenchFries);

        FriedChicken.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getActivity(),"Fried Chicken ADDED to CART", Toast.LENGTH_LONG).show();
            }
        });
        Spaghetti.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getActivity(),"Spaghetti ADD CART", Toast.LENGTH_LONG).show();
            }
        });
        BurgerSteak.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getActivity(),"Burger Steak ADD CART", Toast.LENGTH_LONG).show();
            }
        });
        Hamburger.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getActivity(),"Hamburger ADD CART", Toast.LENGTH_LONG).show();
            }
        });
        FrenchFries.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getActivity(),"French Fries ADD CART", Toast.LENGTH_LONG).show();
            }
        });
        return v;
    }

    public void add_to_list (View view){
        if(view == view.findViewById(R.id.btnSpag)){
            choice = choice + " Spaghetti "+ "\n";
            price = price+100;
            Toast.makeText(getActivity(),"Spaghetti ADD CART", Toast.LENGTH_LONG).show();
        }
        if(view == view.findViewById(R.id.btnFriedChicken)){
            choice = choice + " Fried Chicken "+ "\n";
            price = price+10;
            // Toast.makeText(getActivity(),"Fried Chicken ADD CART", Toast.LENGTH_LONG).show();
        }
        if(view == view.findViewById(R.id.btnBurgerSteak)){
            choice = choice + " Burger Steak "+ "\n";
            price = price+60;
            // Toast.makeText(getActivity(),"Burger Steak ADD CART", Toast.LENGTH_LONG).show();
        }
        if(view == view.findViewById(R.id.btnHamburger)){
            choice = choice + " Burger Steak "+ "\n";
            price = price+60;
            Toast.makeText(getActivity(),"Hamburger ADD CART", Toast.LENGTH_LONG).show();
        }
        if(view == view.findViewById(R.id.btnfrenchFries)){
            choice = choice + " Burger Steak "+ "\n";
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