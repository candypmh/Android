package com.example.myapplication;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class CharacterAdapter extends RecyclerView.Adapter<CharacterAdapter.ViewHolder>{
    //여기서 리스트 나와야 하는거니까
    ArrayList<Character_DTO> items = new ArrayList<Character_DTO>();

    //----------------------------------------------------[Generator - Implement Method...] 2번작업
    //뷰홀더 만들어질 때
    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(viewGroup.getContext());
        View itemView = inflater.inflate(R.layout.frame_imgdetail, viewGroup, false);//인플레이션을 통해 뷰 객체 만들기 frame_imgdetail 이게 character item이나 마찬가지

        return new ViewHolder(itemView);
    }

    //뷰홀더 재사용시
    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, int position) {
        Character_DTO item = items.get(position);
        viewHolder.setItem(item);
    }

    //어댑터에서 관리하는 아이템 개수 반환
    @Override
    public int getItemCount() {
        return items.size();
    }

    //-------------------------------------------------Adapter가 ArrayList안의 객체를 잘 사용할 수 있도록 이것저것 만들기/ 3번작업
    public void addItem(Character_DTO item){
        items.add(item);
    }

    public void setItems(ArrayList<Character_DTO> items){
        this.items = items;
    }

    public Character_DTO getItem(int position){
        return items.get(position);
    }

    public void setItem(int position, Character_DTO item){
        items.set(position, item);
    }






    public CharacterAdapter(ArrayList<Character_DTO> items) {
        this.items = items;
    }

    //-------------------------------------------------1번 작업
    static class ViewHolder extends RecyclerView.ViewHolder{
        ImageView characterImg;
        TextView characterText;
        TextView characterTag;
        TextView characterDate;

        public ViewHolder(View itemView){
            super(itemView);

            characterImg = itemView.findViewById(R.id.characterImg);
            characterText = itemView.findViewById(R.id.characterText);
            characterTag = itemView.findViewById(R.id.characterTag);
            characterDate = itemView.findViewById(R.id.characterDate);
        }


        public void setItem(Character_DTO item){
            characterImg.setImageResource(item.getImg());
            characterText.setText(item.getCharName());
            characterTag.setText(item.getCharTag());
            characterDate.setText(item.getCreateDate());
        }
    }

}
