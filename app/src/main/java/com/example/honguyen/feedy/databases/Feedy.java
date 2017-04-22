package com.example.honguyen.feedy.databases;

/**
 * Created by HongUyen on 22-Apr-17.
 */

public class Feedy  {
    private String image;
    private String name;
    private String recipe;
    private boolean isFavorite;

    public Feedy(String image, String name, String recipe, boolean isFavorite) {
        this.image = image;
        this.name = name;
        this.recipe = recipe;
        this.isFavorite = isFavorite;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRecipe() {
        return recipe;
    }

    public void setRecipe(String recipe) {
        this.recipe = recipe;
    }

    public boolean isFavorite() {
        return isFavorite;
    }

    public void setFavorite(boolean favorite) {
        isFavorite = favorite;
    }

    @Override
    public String toString() {
        return "Feedy{" +
                "image='" + image + '\'' +
                ", name='" + name + '\'' +
                ", recipe='" + recipe + '\'' +
                ", isFavorite=" + isFavorite +
                '}';
    }
}
