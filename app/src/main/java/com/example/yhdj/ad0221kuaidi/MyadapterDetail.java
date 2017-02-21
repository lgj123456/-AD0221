package com.example.yhdj.ad0221kuaidi;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by yhdj on 2017/2/21.
 */

public class MyadapterDetail extends RecyclerView.Adapter<MyadapterDetail.ViewHolder> {

    private KuaidiDetailListBean mKuaidiDetailListBeanresultBean;

    public MyadapterDetail(KuaidiDetailListBean mKuaidiDetailListBeanresultBean){
        this.mKuaidiDetailListBeanresultBean  = mKuaidiDetailListBeanresultBean;

    }

    @Override
    public MyadapterDetail.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.detail_item,parent,false);
        ViewHolder holder = new ViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(MyadapterDetail.ViewHolder holder, int position) {
        KuaidiDetailListBean.ResultBean resultBean= mKuaidiDetailListBeanresultBean.getDeatil().get(position);
        holder.tvCom.setText(resultBean.getCom());
        holder.tvNo.setText(resultBean.getNo());
        holder.tvStatus.setText(resultBean.getStatus());
    }

    @Override
    public int getItemCount() {
        return mKuaidiDetailListBeanresultBean.getDeatil().size();
    }

    static class ViewHolder extends RecyclerView.ViewHolder {
        TextView tvCom;
        TextView tvNo;
        TextView tvStatus;
        public ViewHolder(View itemView) {
            super(itemView);
            tvCom = (TextView) itemView.findViewById(R.id.tv_com);
            tvNo = (TextView) itemView.findViewById(R.id.tv_No);
            tvStatus = (TextView) itemView.findViewById(R.id.tv_status);
        }
    }
}
