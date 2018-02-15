# sassify-sbt-error
project server
assets

then look at
sassify-sbt-error\server\target\web\sass\main\main.css

cbange 
sassify-sbt-error\project\build.properties
sbt.version=0.13.16
And see how the assets generated are different.


The 1.1.1 yields some bad stuff like this:

ï»¿/*!
 *  Font Awesome 4.7.0 by @davegandy - http://fontawesome.io - @fontawesome
 *  License - http://fontawesome.io/license (Font: SIL OFL 1.1, CSS: MIT License)
 .fa-search-plus:before{content:"ï€Ž"}.fa-search-minus:before{content:"ï€�"}.fa-power-off:before{content:"ï€‘"}.fa-signal:before{content:"ï€’"}.fa-gear:before,.fa-cog:before{content:"ï€“"}.fa-trash-o:before{content:"ï€”"}.fa-home:before{content:"ï€•"}.fa-file-o:before{content:"ï€–"}.fa-clock-o:before{content:"ï€—"}.fa-road:before{content:"ï€˜"}.fa-download:before{content:"ï€™"}.fa-arrow-circle-o-down:before{content:"ï€š"}
 
 The 0.13.16 yields some good stuff like this:
 
 /*!
  *  Font Awesome 4.7.0 by @davegandy - http://fontawesome.io - @fontawesome
  *  License - http://fontawesome.io/license (Font: SIL OFL 1.1, CSS: MIT License)
  .fa-search-plus:before{content:""}.fa-search-minus:before{content:""}.fa-power-off:before{content:""}.fa-signal:before{content:""}.fa-gear:before,.fa-cog:before{content:""}.fa-trash-o:before{content:""}.fa-home:before{content:""}.fa-file-o:before{content:""}.fa-clock-o:before{content:""}.fa-road:before{content:""}.fa-download:before{content:""}.fa-arrow-circle-o-down:before{content:""}