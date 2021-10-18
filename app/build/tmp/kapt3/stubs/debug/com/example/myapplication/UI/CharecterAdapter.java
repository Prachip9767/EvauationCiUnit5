package com.example.myapplication.UI;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \u000e2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0002\u000e\u000fB\u0005\u00a2\u0006\u0002\u0010\u0004J\u0018\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\tH\u0016J\u0018\u0010\n\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\tH\u0016\u00a8\u0006\u0010"}, d2 = {"Lcom/example/myapplication/UI/CharecterAdapter;", "Landroidx/paging/PagingDataAdapter;", "Lcom/example/myapplication/Api/ResponseDTOItem;", "Lcom/example/myapplication/UI/CharecterAdapter$MovieViewHolder;", "()V", "onBindViewHolder", "", "holder", "position", "", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "Companion", "MovieViewHolder", "app_debug"})
public final class CharecterAdapter extends androidx.paging.PagingDataAdapter<com.example.myapplication.Api.ResponseDTOItem, com.example.myapplication.UI.CharecterAdapter.MovieViewHolder> {
    @org.jetbrains.annotations.NotNull()
    public static final com.example.myapplication.UI.CharecterAdapter.Companion Companion = null;
    @org.jetbrains.annotations.NotNull()
    private static final androidx.recyclerview.widget.DiffUtil.ItemCallback<com.example.myapplication.Api.ResponseDTOItem> diffUtil = null;
    
    public CharecterAdapter() {
        super(null, null, null);
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.example.myapplication.UI.CharecterAdapter.MovieViewHolder holder, int position) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.example.myapplication.UI.CharecterAdapter.MovieViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u000b"}, d2 = {"Lcom/example/myapplication/UI/CharecterAdapter$MovieViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "itemLayoutBinding", "Lcom/example/myapplication/databinding/ItemLayoutBinding;", "(Lcom/example/myapplication/databinding/ItemLayoutBinding;)V", "getItemLayoutBinding", "()Lcom/example/myapplication/databinding/ItemLayoutBinding;", "setData", "", "responseDTOItem", "Lcom/example/myapplication/Api/ResponseDTOItem;", "app_debug"})
    public static final class MovieViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        @org.jetbrains.annotations.NotNull()
        private final com.example.myapplication.databinding.ItemLayoutBinding itemLayoutBinding = null;
        
        public MovieViewHolder(@org.jetbrains.annotations.NotNull()
        com.example.myapplication.databinding.ItemLayoutBinding itemLayoutBinding) {
            super(null);
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.example.myapplication.databinding.ItemLayoutBinding getItemLayoutBinding() {
            return null;
        }
        
        public final void setData(@org.jetbrains.annotations.NotNull()
        com.example.myapplication.Api.ResponseDTOItem responseDTOItem) {
        }
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u0017\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u00a8\u0006\b"}, d2 = {"Lcom/example/myapplication/UI/CharecterAdapter$Companion;", "", "()V", "diffUtil", "Landroidx/recyclerview/widget/DiffUtil$ItemCallback;", "Lcom/example/myapplication/Api/ResponseDTOItem;", "getDiffUtil", "()Landroidx/recyclerview/widget/DiffUtil$ItemCallback;", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final androidx.recyclerview.widget.DiffUtil.ItemCallback<com.example.myapplication.Api.ResponseDTOItem> getDiffUtil() {
            return null;
        }
    }
}