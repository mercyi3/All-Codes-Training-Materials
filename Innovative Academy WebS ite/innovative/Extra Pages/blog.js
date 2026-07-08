$(document).ready(function() {
    $('.yt-vector').waypoint(function() {
       $('.yt-vector').
       addClass( "animate__animated animate__fadeInRight")
    }, {offset: "80%"})

    $('.over-content').waypoint(function() {
        $('.over-content').
        addClass( "animate__animated animate__fadeInLeft")
     }, {offset: "80%"})

     $('.survey-vector').waypoint(function() {
        $('.survey-vector').
        addClass( "animate__animated animate__fadeInLeft")
     }, {offset: "80%"})
     $('.survey-content').waypoint(function() {
        $('.survey-content').
        addClass( "animate__animated animate__fadeInRight")
     }, {offset: "80%"})

     $('.decod-img').waypoint(function() {
      $('.decod-img').
      addClass( "animate__animated animate__fadeInDown")
   }, {offset: "80%"})
   $('.decod-content2').waypoint(function() {
      $('.decod-content2').
      addClass( "animate__animated animate__fadeInLeft")
   }, {offset: "80%"})
   $('.decod-content1').waypoint(function() {
      $('.decod-content1').
      addClass( "animate__animated animate__fadeInRight")
   }, {offset: "80%"})

   
   $('.points1').waypoint(function() {
      $('.points1').
      addClass( "animate__animated animate__fadeInRight")
   }, {offset: "80%"})
   $('.learn1').waypoint(function() {
      $('.learn1').
      addClass( "animate__animated animate__fadeInLeft")
   }, {offset: "80%"})
   $('.points2').waypoint(function() {
      $('.points2').
      addClass( "animate__animated animate__fadeInLeft")
   }, {offset: "80%"})
   $('.learn2').waypoint(function() {
      $('.learn2').
      addClass( "animate__animated animate__fadeInRight")
   }, {offset: "80%"})

   $('.questions').waypoint(function() {
      $('.questions').
      addClass( "animate__animated animate__fadeInLeft")
   }, {offset: "80%"})
   $('.batches').waypoint(function() {
      $('.batches').
      addClass( "animate__animated animate__fadeInRight")
   }, {offset: "80%"})


})  

// timeline

  // Function to check if an element is in the viewport
  function isInViewport(element) {
   const rect = element.getBoundingClientRect();
   return (
       rect.top < (window.innerHeight || document.documentElement.clientHeight) &&
       rect.bottom > 0
   );
}

// Function to handle the scroll event
function handleScroll() {
   const timeline = document.querySelector('.timeline');
   const sections = document.querySelectorAll('.section');

   // Animate the line when the timeline is in the viewport
   if (isInViewport(timeline)) {
       timeline.classList.add('show-line');
   }

   // Animate sections as they enter the viewport
   sections.forEach((section) => {
       if (isInViewport(section)) {
           section.classList.add('show-me');
       }
   });
}

// Attach the scroll event listener
window.addEventListener('scroll', handleScroll);

// Trigger on page load to animate visible elements
document.addEventListener('DOMContentLoaded', () => {
   handleScroll();
});

// Animations
/*
$(document).ready(function() {
  $('.overview-head1').waypoint(function() {
     $('.overview-head1').
     addClass( "animate__animated animate__fadeInLeft")
  }, {offset: "80%"})

  $('.overview-head2').waypoint(function() {
    $('.overview-head2').
    addClass( "animate__animated animate__fadeInLeft")
 }, {offset: "80%"})

 $('.list1').waypoint(function() {
  $('.list1').
  addClass( "animate__animated animate__fadeInLeft")
}, {offset: "80%"})
$('.list2').waypoint(function() {
  $('.list2').
  addClass( "animate__animated animate__fadeInLeft")
}, {offset: "80%"})
$('.list3').waypoint(function() {
  $('.list3').
  addClass( "animate__animated animate__fadeInLeft")
}, {offset: "80%"})
$('.list4').waypoint(function() {
  $('.list4').
  addClass( "animate__animated animate__fadeInLeft")
}, {offset: "80%"})
$('.list5').waypoint(function() {
  $('.list5').
  addClass( "animate__animated animate__fadeInLeft")
}, {offset: "80%"})

$('.feature1').waypoint(function() {
  $('.feature1').
  addClass( "animate__animated animate__fadeInDown")
}, {offset: "80%"})
$('.feature2').waypoint(function() {
  $('.feature2').
  addClass( "animate__animated animate__fadeInDown")
}, {offset: "80%"})
$('.feature3').waypoint(function() {
  $('.feature3').
  addClass( "animate__animated animate__fadeInDown")
}, {offset: "80%"})

$('.demo').waypoint(function() {
  $('.demo').
  addClass( "animate__animated animate__fadeInRight")
}, {offset: "80%"})
$('.video').waypoint(function() {
  $('.video').
  addClass( "animate__animated animate__fadeInRight")
}, {offset: "80%"})

$('.key1').waypoint(function() {
  $('.key1').
  addClass( "animate__animated animate__fadeInDown")
}, {offset: "100%"})
$('.key2').waypoint(function() {
  $('.key2').
  addClass( "animate__animated animate__fadeInDown")
}, {offset: "100%"})
$('.key3').waypoint(function() {
  $('.key3').
  addClass( "animate__animated animate__fadeInDown")
}, {offset: "100%"})
$('.key4').waypoint(function() {
  $('.key4').
  addClass( "animate__animated animate__fadeInDown")
}, {offset: "100%"})

  $('.section__title').waypoint(function() {
    $('.section__title').
    addClass( "animate__animated animate__backInLeft")
 }, {offset: "80%"})

 $('.brand__content').waypoint(function() {
  $('.brand__content').
  addClass( "animate__animated animate__backInRight")
}, {offset: "80%"})

$('.section__title_who').waypoint(function() {
  $('.section__title_who').
  addClass( "animate__animated animate__backInLeft")
}, {offset: "80%"})
$('.whom').waypoint(function() {
  $('.whom').
  addClass( "animate__animated animate__backInLeft")
}, {offset: "80%"})

$('.who_list1').waypoint(function() {
  $('.who_list1').
  addClass( "animate__animated animate__lightSpeedInRight")
}, {offset: "80%"})
$('.who_list2').waypoint(function() {
  $('.who_list2').
  addClass( "animate__animated animate__lightSpeedInRight")
}, {offset: "80%"})
$('.who_list3').waypoint(function() {
  $('.who_list3').
  addClass( "animate__animated animate__lightSpeedInRight")
}, {offset: "80%"})
$('.who_list4').waypoint(function() {
  $('.who_list4').
  addClass( "animate__animated animate__lightSpeedInRight")
}, {offset: "80%"})
$('.who_list5').waypoint(function() {
  $('.who_list5').
  addClass( "animate__animated animate__lightSpeedInRight")
}, {offset: "80%"})

$('.reviewVideo').waypoint(function() {
  $('.reviewVideo').
  addClass( "animate__animated animate__flipInY")
}, {offset: "80%"})

$('.IA1').waypoint(function() {
  $('.IA1').
  addClass( "animate__animated animate__rollIn")
}, {offset: "80%"})
$('.IA2').waypoint(function() {
  $('.IA2').
  addClass( "animate__animated animate__rollIn")
}, {offset: "80%"})
$('.IA3').waypoint(function() {
  $('.IA13').
  addClass( "animate__animated animate__rollIn")
}, {offset: "80%"})

$('.section__title_job').waypoint(function() {
  $('.section__title_job').
  addClass( "animate__animated animate__backInLeft")
}, {offset: "80%"})

$('.job1').waypoint(function() {
  $('.job1').
  addClass( "animate__animated animate__flipInX")
}, {offset: "80%"})
$('.job2').waypoint(function() {
  $('.job2').
  addClass( "animate__animated animate__flipInX")
}, {offset: "80%"})
$('.job3').waypoint(function() {
  $('.job3').
  addClass( "animate__animated animate__flipInX")
}, {offset: "80%"})
$('.job4').waypoint(function() {
  $('.job4').
  addClass( "animate__animated animate__flipInX")
}, {offset: "80%"})
$('.job5').waypoint(function() {
  $('.job5').
  addClass( "animate__animated animate__flipInX")
}, {offset: "80%"})
$('.job6').waypoint(function() {
  $('.job6').
  addClass( "animate__animated animate__flipInX")
}, {offset: "80%"})

$('.tool1').waypoint(function() {
  $('.tool1').
  addClass( "animate__animated animate__flipInX")
}, {offset: "80%"})
$('.tool2').waypoint(function() {
  $('.tool2').
  addClass( "animate__animated animate__flipInX")
}, {offset: "80%"})
$('.tool3').waypoint(function() {
  $('.tool3').
  addClass( "animate__animated animate__flipInX")
}, {offset: "80%"})
$('.tool4').waypoint(function() {
  $('.tool4').
  addClass( "animate__animated animate__flipInX")
}, {offset: "80%"})
$('.tool5').waypoint(function() {
  $('.tool5').
  addClass( "animate__animated animate__flipInX")
}, {offset: "80%"})
$('.tool6').waypoint(function() {
  $('.tool6').
  addClass( "animate__animated animate__flipInX")
}, {offset: "80%"})

$('.section__title_skill').waypoint(function() {
  $('.section__title_skill').
  addClass( "animate__animated animate__backInRight")
}, {offset: "80%"})

$('.skill1').waypoint(function() {
  $('.skill1').
  addClass( "animate__animated animate__flipInX")
}, {offset: "80%"})
$('.skill2').waypoint(function() {
  $('.skill2').
  addClass( "animate__animated animate__flipInX")
}, {offset: "80%"})
$('.skill3').waypoint(function() {
  $('.skill3').
  addClass( "animate__animated animate__flipInX")
}, {offset: "80%"})
$('.skill4').waypoint(function() {
  $('.skill4').
  addClass( "animate__animated animate__flipInX")
}, {offset: "80%"})
$('.skill5').waypoint(function() {
  $('.skill5').
  addClass( "animate__animated animate__flipInX")
}, {offset: "80%"})
$('.skill6').waypoint(function() {
  $('.skill6').
  addClass( "animate__animated animate__flipInX")
}, {offset: "80%"})

$('.section__title_company').waypoint(function() {
  $('.section__title_company').
  addClass( "animate__animated animate__backInLeft")
}, {offset: "80%"})
$('.section__title_mentor').waypoint(function() {
  $('.section__title_mentor').
  addClass( "animate__animated animate__backInRight")
}, {offset: "80%"})
$('.mentor1').waypoint(function() {
  $('.mentor1').
  addClass( "animate__animated animate__flipInY")
}, {offset: "80%"})
$('.mentor2').waypoint(function() {
  $('.mentor2').
  addClass( "animate__animated animate__flipInY")
}, {offset: "80%"})
$('.mentor3').waypoint(function() {
  $('.mentor3').
  addClass( "animate__animated animate__flipInY")
}, {offset: "80%"})

$('.section__title_feed').waypoint(function() {
  $('.section__title_feed').
  addClass( "animate__animated animate__backInLeft")
}, {offset: "80%"})
$('.section__title_blog').waypoint(function() {
  $('.section__title_blog').
  addClass( "animate__animated animate__backInRight")
}, {offset: "80%"})
$('.blog1').waypoint(function() {
  $('.blog1').
  addClass( "animate__animated animate__flipInY")
}, {offset: "80%"})
$('.blog2').waypoint(function() {
  $('.blog2').
  addClass( "animate__animated animate__flipInY")
}, {offset: "80%"})
$('.blog3').waypoint(function() {
  $('.blog3').
  addClass( "animate__animated animate__flipInY")
}, {offset: "80%"})

$('.section__title_brand').waypoint(function() {
  $('.section__title_brand').
  addClass( "animate__animated animate__backInLeft")
}, {offset: "80%"})

})
*/
