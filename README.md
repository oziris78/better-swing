
# Better Swing

<p> <!-- BADGES -->
<!-- badge 1 -->
    <a href="https://github.com/oziris78/telek-math/stargazers">
        <img alt="GitHub stars" src="https://img.shields.io/github/stars/oziris78/better-swing">
    </a>
<!-- badge 2 -->
    <a href="https://github.com/oziris78/telek-math/network">
        <img alt="GitHub forks" src="https://img.shields.io/github/forks/oziris78/better-swing">
    </a>
<!-- badge 3 -->
    <a href="https://github.com/oziris78/telek-math/blob/master/LICENSE.txt">
        <img alt="GitHub license" src="https://img.shields.io/github/license/oziris78/better-swing?color=blue"/>
    </a>
<!-- badge 4 -->
    <img alt="GitHub Repo size" src="https://img.shields.io/github/repo-size/oziris78/better-swing"/>
<!-- badge end -->
</p>

Better Swing, aims to have better functioning and easier to write swing components while providing many utility classes related to Java Swing (or AWT).

This repository was created on 20.03.2022

<br>


## Importing Better Swing

Add these to your build.gradle file

```GROOVY
allprojects {
    repositories {
        maven { url 'https://jitpack.io' }
    }
}

dependencies {
    implementation 'com.github.oziris78:better-swing:v0.0.1'
}
```

Note: <b> Better Swing currently has no dependencies. </b>


<br>

## How To Use Better Swing

Better Swing currently has no wiki, but it has javadocs to guide you!

### Better Swing In It's Core

All Better Swing components are named as so:  
| Swing | Better Swing | 
| ----------- | ----------- | 
| JButton | SwingButton |
| JLabel | SwingLabel |
| JSlider | SwingSlider |
| ... | ... |

<br>

Better Swing components are nothing but wrappers created so we can use method chaining like so:

```JAVA
public static main(String[] args){
    JButton btn = return new SwingButton()
                            .setBounds(new Rectangle(0, 0, 100, 100))
                            .setText("hi")
                            .setForeground(new Color(0, 100, 200))
                            .setLayout(null)
                            .setBorder(null)
                            .setRolloverEnabled(true)
                            .setOpaque(true)
                            .setVisible(true)
                            .setEnabled(true)
                            .setContentAreaFilled(false)
                            .setFocusable(false)
                            .getButton();
}
```

Note: Check out the other classes for many utility methods!

<br>


### Some Notes
- Better Swing was developed by only one person (Oğuzhan Topaloğlu)
- Wiki won't be coming soon.

<br>

## Projects Using Better Swing

- <a href="https://github.com/oziris78/tunerik_kosusu">Tünerik Koşusu</a>



