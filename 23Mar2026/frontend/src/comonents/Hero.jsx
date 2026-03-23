function Hero() {
  return (
    <>
      <section className="flex flex-col w-full justify-center items-center h-75">
        <div className="text-center flex flex-col items-center">
          <div className="text-6xl pb-5">Prosperity of Knowledge</div>
          <div className="text-2xl pb-10">JCBM College, Sringeri</div>

          {/* <div className="px-5 py-3 w-50 bg-black text-white text-center">
            Explore
          </div> */}
        </div>
        <div className="flex justify-center">
          <button className=" py-3 w-50 bg-black text-white text-center items-center">
            Explore
          </button>
        </div>
      </section>

      <section className="flex w-full justify-center items-center">
        <div>About Us</div>
      </section>
    </>
  );
}
export default Hero;
