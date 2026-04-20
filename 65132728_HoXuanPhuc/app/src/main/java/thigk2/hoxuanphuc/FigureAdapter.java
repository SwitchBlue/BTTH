package thigk2.hoxuanphuc;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class FigureAdapter extends RecyclerView.Adapter<FigureAdapter.FigureViewHolder> {

    private List<HistoricalFigure> figureList;

    public FigureAdapter(List<HistoricalFigure> figureList) {
        this.figureList = figureList;
    }

    @NonNull
    @Override
    public FigureViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_historical_figure, parent, false);
        return new FigureViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull FigureViewHolder holder, int position) {
        HistoricalFigure figure = figureList.get(position);
        holder.tvName.setText(figure.getName());
        holder.tvBirthplace.setText(figure.getBirthplace());
        holder.ivPhoto.setImageResource(figure.getImageResource());
    }

    @Override
    public int getItemCount() {
        return figureList.size();
    }

    public static class FigureViewHolder extends RecyclerView.ViewHolder {
        ImageView ivPhoto;
        TextView tvName, tvBirthplace;

        public FigureViewHolder(@NonNull View itemView) {
            super(itemView);
            ivPhoto = itemView.findViewById(R.id.ivPhoto);
            tvName = itemView.findViewById(R.id.tvName);
            tvBirthplace = itemView.findViewById(R.id.tvBirthplace);
        }
    }
}