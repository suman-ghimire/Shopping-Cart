$(function () {
    // solving the active menu problem.
    switch (menubar) {
        case 'About Us':
            $("#about").addClass('active');
            break;
        case 'Contact Us':
            $("#contact").addClass('active');
            break;
        case 'All Products':
            $('#listProducts').addClass('active');
            break;
        default:
            $("#listProducts").addClass('active');
            $("#a_"+menubar).addClass('active');
            break;

    }
    
})