package www.psycodes.in.patient_manegement_system;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class SearchAdapter extends RecyclerView.Adapter<SearchAdapter.viewHolder> {
    private String data[];
    public  SearchAdapter(String[] data){
        this.data=data;
    }

    @Override
    public viewHolder onCreateViewHolder( ViewGroup viewGroup, int i) {
        LayoutInflater inflater = LayoutInflater.from(viewGroup.getContext());
        View view = inflater.inflate(R.layout.search_item_list,viewGroup,false);
        return new viewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull viewHolder viewHolder, int i) {
        String Title =data[i];
        viewHolder.item.setText(Title);
    }

    @Override
    public int getItemCount() {
        return data.length;
    }

    public class viewHolder extends RecyclerView.ViewHolder{

        TextView item;

        public viewHolder(@NonNull View itemView) {
            super(itemView);
            item = itemView.findViewById(R.id.search_item);
        }
    }

}
