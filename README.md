# LinearProgressBar

### DESCRIPTION
This is a General pourpous java swing 2DGraphics component created as a classic linear progress bar. 

<img src="out\artifacts\LinearProgressBar_jar\UI.JPG" width="100%">

This java swing component can integrate with a classic UI design.

### HOW TO USE?
To use this component on your project, download or coppy [LinearPogrssBar.java](src/LinearPogrssBar.java) into your src ( or package) folder.
then make a object of LinearProgressBar class on your GUI design class
> <code>LinearPogrssBar linearPogrssBar = new LinearPogrssBar();</code>

now generate your percentage value from wherever in your code.
finally call _Update_ and _repaint_ methods from _linearPogrssBar_
<code>
>  linearPogrssBar.Update(i);
> linearPogrssBar.repaint();
</code>
