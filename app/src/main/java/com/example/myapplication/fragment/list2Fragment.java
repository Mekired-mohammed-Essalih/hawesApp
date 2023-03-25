package com.example.myapplication.fragment;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import com.example.myapplication.ListFragment;
import com.example.myapplication.R;
import com.example.myapplication.item;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link list2Fragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class list2Fragment extends Fragment {
    String[] name={"constantine","annaba","setif","oran","bejaia"};
    String[] description={"constantine","annaba","setif","oran","bejaia"};
    int [] images={R.drawable.constantine,R.drawable.annaba,R.drawable.setif,R.drawable.oran,R.drawable.bejaia};


    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public list2Fragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment list2Fragment.
     */
    // TODO: Rename and change types and number of parameters
    public static list2Fragment newInstance(String param1, String param2) {
        list2Fragment fragment = new list2Fragment();
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
    public class ListAdapter extends ArrayAdapter {
        String[] description;
        int images[];

        public ListAdapter(Context context, int resource, String[] objects, String[] description, int images[]) {
            super(context, resource, objects);
            this.description = description;
            this.images = images;
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            View v=((Activity)getContext()).getLayoutInflater().inflate(R.layout.row,null);
            TextView txt1 = (TextView) v.findViewById(R.id.textView1);
            txt1.setText(name[position]);
            TextView txt2 = (TextView) v.findViewById(R.id.textView2);
            txt2.setText(description[position]);
            ImageView img = (ImageView) v.findViewById(R.id.image);
            img.setBackgroundResource(images[position]);

            return v;
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        // Inflate the layout for this fragment
        // return inflater.inflate(R.layout.fragment_list, container, false);
        View view = inflater.inflate(R.layout.fragment_list2, container, false);
        ListView list = (ListView) view.findViewById(R.id.listView);
        list.setAdapter(new list2Fragment.ListAdapter(getActivity(),R.layout.row,name,description,images));
        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                if (i ==  0) {
                    Intent myIntent = new Intent(getActivity(), item.class);
                    myIntent.putExtra("name",name[i]);
                    myIntent.putExtra("phone",description[i]);
                    myIntent.putExtra("country",description[i]);
                    myIntent.putExtra("imageid",images[i]);
                    startActivity(myIntent);
                }
                if (i ==  1) {
                    Intent myIntent = new Intent(getActivity(), item.class);
                    myIntent.putExtra("name",name[i]);
                    myIntent.putExtra("phone",description[i]);
                    myIntent.putExtra("country",description[i]);
                    myIntent.putExtra("imageid",images[i]);
                    startActivity(myIntent);
                }
                if (i ==  2) {
                    Intent myIntent = new Intent(getActivity(), item.class);
                    myIntent.putExtra("name",name[i]);
                    myIntent.putExtra("phone",description[i]);
                    myIntent.putExtra("country",description[i]);
                    myIntent.putExtra("imageid",images[i]);
                    startActivity(myIntent);
                }
            }
        });
        //set the adapter, etc
        return view;
    }
}