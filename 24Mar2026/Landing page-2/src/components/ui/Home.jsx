function Home() {
  return (
    <>
      <div className="flex justify-between pt-5 pb-2 pl-30 pr-30 ">
        <div>
          <div className="font-bold">RANTY</div>
        </div>

        <div className="flex gap-5">
          <div>Services</div>
          <div>Homes</div>
          <div>About Us</div>
          <div>Cases</div>
        </div>

        <div className="flex gap-5 ">
          <div>ENG</div>
          <div className="text-gray-400">|</div>
          <div className="underline">CONTACT US</div>
        </div>
      </div>
    </>
  );
}

export default Home;
