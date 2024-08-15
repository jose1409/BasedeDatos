function loadComponent(url) {
    console.log(url);
        $.ajax({
            url: url,
            type: "GET",
            success: function(data) {
                $('#content-container').html(data);
            },
            error: function() {
                alert('Error loading component');
            }
        });
    }

