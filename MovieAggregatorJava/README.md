MovieAggregatorJava

Movie Aggregator:

Part A:

Create a console based application that accepts movie details like Name, Run Time, Language, Lead Actor and Genre and then export these details into one of the 2 formats, depending on user’s choice - “plain text” or “PDF”.

Part B:

Make the application extensible so that it is easy to “plug in” a new format and the application automatically has the capability to export to the new format without making any changes to the application code. Solution to the aforementioned problem:

The output to the problem can be realized with the help of four classes,

The Main Interaction Model : which will interact with the user and store the details of the movie Abstract Writer Class : A function("write") to to be abstracted with PDfWrite or TextWrite class function "write" PdfWriter: A class of to output pdf format TextWriter: A class of to output text format

For example if we wish our output to be in a CSV, XLS, zip, JSON, XML, HTML, Images, Hierarchical Data Format(HDF) or DOCX format we just have to write a class with name, lets assusme CSV then, CSVWriter which will extend the abstract class "Writer" and add the functionality to convert input of the form Map>. Voila!

language used : JAVA used Tools : Eclipse.

Part A 1. To run the project, enter follow the instructions after calling the interactionModel.java 2. to Write pdf or text, just specify the format of the form "Text" or "Pdf" as instructed by the code.

Part B In case it is required to add a new type of format for exporting the data then we will have to write a class with name,if export format is CSV then, CSVWriter which will extend the abstract class "Writer" and add the functionality to convert input of the form Map> to desired format.