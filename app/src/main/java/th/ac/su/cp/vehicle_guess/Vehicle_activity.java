package th.ac.su.cp.vehicle_guess;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import th.ac.su.cp.vehicle_guess.model.Vehicle_item;

public class Vehicle_activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vehicle_activity);
        MyAdapter adapter = new MyAdapter();
        LinearLayoutManager layout = new LinearLayoutManager(Vehicle_activity.this);
        RecyclerView rv = findViewById(R.id.recycle_activity);
        rv.setLayoutManager(layout);
        rv.setAdapter(adapter);
    }

}
class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyViewHolder>{
    //WordItem item,item2;
    Vehicle_item[] items={
            new Vehicle_item(R.drawable.bic,"1.Bicycle",9),
            new Vehicle_item(R.drawable.bus,"2.Bus",10000),
            new Vehicle_item(R.drawable.car,"3.Car",1600),
            new Vehicle_item(R.drawable.firet,"4.Fire-Truck",28000),
            new Vehicle_item(R.drawable.motor,"5.Motorcycle",100),
            new Vehicle_item(R.drawable.palne,"6.Plane",50000),
            new Vehicle_item(R.drawable.ship,"7.Ship",50000),
            new Vehicle_item(R.drawable.traib,"8.Train",3500000),
            new Vehicle_item(R.drawable.truck,"9.Truck",3000),
            new Vehicle_item(R.drawable.heli,"10.Helicopter",5000 ),

    };

    public MyAdapter(){
        //item = new WordItem(R.drawable.cat,"CAT");
        //item2 = new WordItem(R.drawable.dog,"DOG");

    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.vehicle_position, parent, false);
        MyViewHolder vh = new MyViewHolder(v);
        return vh;
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        holder.imageview.setImageResource(items[position].imageResId);
        holder.textview.setText(items[position].vehicle_name);
        holder.textview2.setText(items[position].weight);}
    @Override
    public int getItemCount() {
        return items.length;
    }

    class MyViewHolder extends RecyclerView.ViewHolder{

        ImageView imageview;
        TextView textview;
        TextView textview2;


        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            imageview = itemView.findViewById(R.id.imageViewpos);
            textview = itemView.findViewById(R.id.textViewpos);
            textview2 = itemView.findViewById(R.id.textViewpos2);
        }
    }

}