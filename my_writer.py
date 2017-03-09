from reportlab.pdfgen import canvas

class specificMovieReport():
    @staticmethod
    def text(movies):
        with open("output.text","w") as f:
        	s= "Movie Name | Run_Time | Language | Lead_Actor | Genre \n"
        	f.write(s)
        	f.write("\n")
        	for movie in movies:
        		f.write(movie.name + " | " + movie.run_time + " | " + movie.language + " | "  + movie.lead_actor + " | " + movie.genre + "\n")
        	f.close()

    @staticmethod
    #This method will use reportlab module to generate pdf file
    def pdf(movies):
        with open("output.text","w") as f2:
        	s = "Movie Name | Run_Time | Language | Lead_Actor | Genre \n"
        	f2.write(s)
        	f2.write("\n")
        	for movie in movies:
        		f2.write(movie.name + " | " + movie.run_time + " | " + movie.language + " | "  + movie.lead_actor + " | " + movie.genre + "\n")
        	f2.close()
        ptr = open("output.text", "r")  # text file I need to convert
        total_lines_read = ptr.readlines()
        ptr.close()
        i = 750
        c = canvas.Canvas("outputIn_pdf.pdf",bottomup =1 )
        numberoflines = 0
        while numberoflines < len(total_lines_read):
            i=750
            for linea in total_lines_read[numberoflines:]:
                c.drawString(15, i, linea.strip())
                numberoflines += 1
                i -= 12
        c.save()