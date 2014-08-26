
package views.html

import play.templates._
import play.templates.TemplateMagic._

import play.api.templates._
import play.api.templates.PlayMagic._
import models._
import controllers._
import play.api.i18n._
import play.api.mvc._
import play.api.data._
import views.html._
/**/
object index extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template0[play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply():play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](format.raw/*1.1*/("""<!doctype html>
<html lang="en" ng-app="myApp">
<head>
    <meta charset="utf-8">
    <title>mm-Lunch</title>
    <!-- Latest compiled and minified Bootstrap CSS -->
    <link rel="stylesheet" href="//netdna.bootstrapcdn.com/bootstrap/3.1.1/css/bootstrap.min.css">
    <link rel="stylesheet" href="//netdna.bootstrapcdn.com/bootstrap/3.1.1/css/bootstrap-theme.min.css">
    <link rel="stylesheet" media='screen' href='"""),_display_(Seq[Any](/*9.50*/routes/*9.56*/.Assets.at("stylesheets/main.css"))),format.raw/*9.90*/("""'>
</head>
<body>
<div class="container-fluid col-md-10 col-md-offset-1">
    <!-- Fixed navbar -->
    <header>
        <div class="navbar navbar-default navbar-fixed-top" role="navigation">
            <div class="navbar-header">
                <button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".navbar-collapse">
                    <span class="sr-only">Toggle navigation</span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                </button>
                <a class="navbar-brand" href="#/">mm-Lunch</a>
            </div>
        </div>
    </header>

    <div ng-view></div>

    <div>
        <footer>
            <hr/>
            <div>
                <span>&copy; mm-Lunch 2014</span>
                <span class="pull-right">version : <span app-version></span></span>
            </div>
        </footer>
    </div>
</div>
</body>

<script src='//ajax.googleapis.com/ajax/libs/angularjs/1.2.13/angular.js' type="text/javascript"></script>
<script src='//ajax.googleapis.com/ajax/libs/angularjs/1.2.13/angular-route.js' type="text/javascript"></script>
<script src='"""),_display_(Seq[Any](/*44.15*/routes/*44.21*/.Assets.at("javascripts/vendor/ui-bootstrap-tpls-0.10.0.js"))),format.raw/*44.81*/("""' type="text/javascript"></script>

<script src='"""),_display_(Seq[Any](/*46.15*/routes/*46.21*/.Assets.at("javascripts/main.js"))),format.raw/*46.54*/("""' type="text/javascript"></script>

<!-- Coffee script compilled resources-->
<script src='"""),_display_(Seq[Any](/*49.15*/routes/*49.21*/.Assets.at("javascripts/app.js"))),format.raw/*49.53*/("""' type="text/javascript"></script>
<script src='"""),_display_(Seq[Any](/*50.15*/routes/*50.21*/.Assets.at("javascripts/common/Config.js"))),format.raw/*50.63*/("""' type="text/javascript"></script>
<script src='"""),_display_(Seq[Any](/*51.15*/routes/*51.21*/.Assets.at("javascripts/directives/AppVersion.js"))),format.raw/*51.71*/("""' type="text/javascript"></script>

<script src='"""),_display_(Seq[Any](/*53.15*/routes/*53.21*/.Assets.at("javascripts/users/UserService.js"))),format.raw/*53.67*/("""' type="text/javascript"></script>
<script src='"""),_display_(Seq[Any](/*54.15*/routes/*54.21*/.Assets.at("javascripts/users/UserCtrl.js"))),format.raw/*54.64*/("""' type="text/javascript"></script>
<script src='"""),_display_(Seq[Any](/*55.15*/routes/*55.21*/.Assets.at("javascripts/users/CreateUserCtrl.js"))),format.raw/*55.70*/("""' type="text/javascript"></script>

</html>"""))}
    }
    
    def render(): play.api.templates.HtmlFormat.Appendable = apply()
    
    def f:(() => play.api.templates.HtmlFormat.Appendable) = () => apply()
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Tue Aug 26 17:56:28 UTC 2014
                    SOURCE: C:/Users/user/workspace/modern-web-template/app/views/index.scala.html
                    HASH: 42c0e592823f063def8dc20bc3a90696edc5cfa0
                    MATRIX: 637->0|1091->419|1105->425|1160->459|2421->1684|2436->1690|2518->1750|2604->1800|2619->1806|2674->1839|2802->1931|2817->1937|2871->1969|2956->2018|2971->2024|3035->2066|3120->2115|3135->2121|3207->2171|3293->2221|3308->2227|3376->2273|3461->2322|3476->2328|3541->2371|3626->2420|3641->2426|3712->2475
                    LINES: 22->1|30->9|30->9|30->9|65->44|65->44|65->44|67->46|67->46|67->46|70->49|70->49|70->49|71->50|71->50|71->50|72->51|72->51|72->51|74->53|74->53|74->53|75->54|75->54|75->54|76->55|76->55|76->55
                    -- GENERATED --
                */
            