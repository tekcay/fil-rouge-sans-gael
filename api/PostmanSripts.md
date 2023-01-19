To do in `POST` mode in Postman.
In `Headers`, select `Content-Type` in `KEY` and `application/json` in `VALUE`.

The JSON must be parsed in `Body` as `raw` and `json.`



### Create a theme:

* url : `http://localhost:8080/theme-controller/create-theme`

* JSON: ``{
"name": "Langage"
}``

### Create a subTheme:

* url : `http://localhost:8080/stheme-controller/create-stheme`
* JSON: ``{
"name": "Java"
}``

### Create a subsubTheme:

* url: `http://localhost:8080/sstheme-controller/create-sstheme`
* JSON: ``{
"name": "Algorithmie"
}``

### Create a formation :

* url: `http://localhost:8080/formation-controller/create-formation`
* JSON: ``
{
"name": "Programmation-Java",
"description" : "une belle formation",
"themeId": 1,
"sousThemesId": [1],
"ssThemesId": [1]
}
``