package com.example.yhdj.ad0221kuaidi;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by yhdj on 2017/2/21.
 */

public class Myadapter extends RecyclerView.Adapter<Myadapter.ViewHolder> {



    private kuaidiNoList mKuaidiNoList;

    public Myadapter(kuaidiNoList mKuaidiNoList){
        this.mKuaidiNoList = mKuaidiNoList;
    }
    @Override
    public Myadapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.comno_item,parent,false);
        ViewHolder viewHolder = new ViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(Myadapter.ViewHolder holder, int position) {
        kuaidiNoList.ResultBean resultBean = mKuaidiNoList.getResult().get(position);
        holder.mTextViewCom.setText(resultBean.getCom());
        holder.mTextViewNo.setText(resultBean.getNo());
    }

    @Override
    public int getItemCount() {
        return mKuaidiNoList.getResult().size();
    }

   static class ViewHolder extends RecyclerView.ViewHolder{
       TextView mTextViewCom;
       TextView mTextViewNo;

       public ViewHolder(View itemView) {
           super(itemView);
           mTextViewCom  = (TextView) itemView.findViewById(R.id.tv_com);
           mTextViewNo = (TextView) itemView.findViewById(R.id.tv_No);
       }
   }
}
