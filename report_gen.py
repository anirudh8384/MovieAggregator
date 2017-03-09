from reportlab.pdfgen import canvas
from my_writer import specificMovieReport
def getOutputReport(movie, export_method):
    #Method with Reflection
    getattr(specificMovieReport,export_method)([movie])
    import pdb;pdb.set_trace()
    
    
    