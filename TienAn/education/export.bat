mvn -pl . clean install & ^
mvn -pl education-sdk clean install & ^
mvn -pl education-admin-plugin clean install -Pexport,\!test & ^
mvn -pl education-web-plugin clean install -Pexport,\!test & ^
mvn -pl education-theme clean install -Pexport,\!test & ^
ezy.bat package & ^
ezy.bat export
