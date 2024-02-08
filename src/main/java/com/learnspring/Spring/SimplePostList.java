package com.learnspring.Spring;

import java.util.ArrayList;

public class SimplePostList implements PostList{

    ArrayList<Post> postList;

    public SimplePostList(){
        this.postList=new ArrayList<Post>();
    }
    @Override
    public ArrayList<Post> getAllPosts() {
        return postList;
    }

    @Override
    public Post getPost(int i) {
        return this.postList.get(i);
    }

    @Override
    public void setPost(Post post) {
        this.postList.add(post);
    }

    @Override
    public int size() {
        return this.postList.size();
    }
}
